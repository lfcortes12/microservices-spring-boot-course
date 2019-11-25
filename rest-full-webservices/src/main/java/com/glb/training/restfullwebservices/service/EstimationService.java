package com.glb.training.restfullwebservices.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.glb.training.restfullwebservices.model.Estimation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EstimationService {

   protected static final List<Estimation> estimations;

   static {
      estimations = Stream.of(Estimation.builder().value(1).estimationId(1L).build()).collect(Collectors.toList());
   }

   public Optional<Estimation> findOne(final Long estimationId) {
      return estimations.stream().parallel().filter(estimation -> estimation.getEstimationId().equals(estimationId)).findFirst();
   }

   public List<Estimation> findAll() {
      return estimations;
   }

   public Estimation save(final Estimation estimation) {
      log.debug("Persist {}", estimation);
      var estimationToSave = estimation;
      if (Objects.isNull(estimation.getEstimationId())) {
         log.debug("Setting id");
         var size = estimations.size() + 1;
         estimationToSave = Estimation.builder().estimationId(Long.valueOf(size)).value(estimation.getValue()).build();
      }
      estimations.add(estimationToSave);
      return estimationToSave;
   }

}
