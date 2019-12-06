package com.glb.training.restfullwebservices.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlbResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

   @ExceptionHandler(Exception.class)
   public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
      final ExceptionResponse exceptionResponse = ExceptionResponse.builder().eventDateTime(LocalDateTime.now())
            .message(ex.getMessage()).detail(request.getDescription(false)).build();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionResponse);
   }

   @ExceptionHandler(ResourceNotFoundException.class)
   public final ResponseEntity<ExceptionResponse> handleResourceNotFoundException(ResourceNotFoundException ex,
         WebRequest request) {
      final ExceptionResponse exceptionResponse = ExceptionResponse.builder().eventDateTime(LocalDateTime.now())
            .message(ex.getMessage()).detail(request.getDescription(false)).build();
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
   }
   
   @Override
   protected ResponseEntity<Object> handleMethodArgumentNotValid(
         MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
      final ExceptionResponse exceptionResponse = ExceptionResponse.builder().eventDateTime(LocalDateTime.now())
            .message("Validation Failed").detail(ex.getBindingResult().toString()).build();
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
   }

}
