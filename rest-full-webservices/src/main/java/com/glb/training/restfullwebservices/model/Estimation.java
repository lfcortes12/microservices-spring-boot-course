package com.glb.training.restfullwebservices.model;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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
    
    @Min(value = 0, message = "Should be positive")
    @NotNull(message = "Requiered value")
    private Integer value;

}
