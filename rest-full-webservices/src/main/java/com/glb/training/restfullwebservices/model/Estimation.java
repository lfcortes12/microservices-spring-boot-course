package com.glb.training.restfullwebservices.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Estimation {

    private Long estimationId;
    private Integer value;

}
