package com.glb.training.restfullwebservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glb.training.restfullwebservices.model.Estimation;

@Service
public class EstimationService {

   public Estimation getEstimationById(final Long estimationId) {
      return new Estimation(estimationId, 5);
   }

   public List<Estimation> getAllEstimations() {
      return List.of(Estimation.builder().value(1).estimationId(2L).build());
   }

}
