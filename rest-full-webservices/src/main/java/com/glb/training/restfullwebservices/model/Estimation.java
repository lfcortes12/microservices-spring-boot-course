package com.glb.training.restfullwebservices.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Estimation {

    private final Long estimationId;
    private final Integer value;

}
