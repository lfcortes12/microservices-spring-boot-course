package com.glb.training.restfullwebservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

//@JsonFilter("UserFilter")
@JsonIgnoreProperties(value = {"password"})
@Builder
@Getter
@AllArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private final int id;
	
	@Column(name = "name")
	private final String name;
	
	@Column(name = "username")
	private final String username;
	
	@Column(name = "password")
	private final String password;

}
