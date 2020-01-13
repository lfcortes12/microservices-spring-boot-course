package com.glb.training.restfullwebservices.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

//@JsonFilter("UserFilter")
@JsonIgnoreProperties(value = {"password"})
@Builder
@Getter
@AllArgsConstructor
public class User {
	
	private final int id;
	private final String name;
	private final String username;
	private final String password;

}
