package com.glb.training.restfullwebservices.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ExceptionResponse {
   
   private final LocalDateTime eventDateTime;
   private final String message;
   private final String detail;

}
