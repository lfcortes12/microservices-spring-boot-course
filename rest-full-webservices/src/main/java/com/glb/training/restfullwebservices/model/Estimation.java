package com.glb.training.restfullwebservices.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
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

	@Schema(description = "Estimation Identified", required = true, example = "20")
	private Long estimationId;

	@Schema(description = "Estimated value, Should be a value of Fibonnaci", required = true,  example = "13")
	@Min(value = 0, message = "Should be positive")
	@NotNull(message = "Requiered value")
	private Integer value;
	
	@JsonIgnore
	private String description;

}
