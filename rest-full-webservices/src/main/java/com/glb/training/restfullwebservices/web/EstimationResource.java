package com.glb.training.restfullwebservices.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.glb.training.restfullwebservices.exception.ResourceNotFoundException;
import com.glb.training.restfullwebservices.model.Estimation;
import com.glb.training.restfullwebservices.service.EstimationService;

import lombok.AllArgsConstructor;

@RequestMapping(value = "/estimations")
@RestController
@AllArgsConstructor
public class EstimationResource {

   @Autowired
   private final EstimationService estimationService;

   @GetMapping(path = "/")
   public ResponseEntity<List<Estimation>> getEstimations() {
      return ResponseEntity.ok(estimationService.findAll());
   }

   @GetMapping(path = "/{estimationId}")
   public ResponseEntity<Estimation> getEstimation(@PathVariable final Long estimationId) {
      Estimation response = estimationService.findOne(estimationId)
            .orElseThrow(() -> new ResourceNotFoundException("Resource Not Found"));

      return ResponseEntity.ok(response);
   }

   @PostMapping(path = "/")
   public ResponseEntity<Object> save(@RequestBody final Estimation estimation) {

      Estimation estimationSaved = estimationService.save(estimation);
      final URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
            .buildAndExpand(estimationSaved.getEstimationId()).toUri();

      return ResponseEntity.created(uri).build();
   }

   @DeleteMapping(path = "/{estimationId}")
   public void save(@PathVariable final Long estimationId) {
      boolean isRemoved = estimationService.deleteById(estimationId);
      if (!isRemoved)
         throw new ResourceNotFoundException("Resource Not Found");
   }

}
