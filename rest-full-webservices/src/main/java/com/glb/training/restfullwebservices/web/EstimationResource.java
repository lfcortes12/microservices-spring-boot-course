package com.glb.training.restfullwebservices.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glb.training.restfullwebservices.model.Estimation;
import com.glb.training.restfullwebservices.service.EstimationService;

import lombok.AllArgsConstructor;

@RequestMapping(value = "/estimation")
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
    public ResponseEntity<Estimation> getEstimation(@PathVariable Long estimationId) {
        return ResponseEntity.ok(estimationService.findOne(estimationId));
    }
}
