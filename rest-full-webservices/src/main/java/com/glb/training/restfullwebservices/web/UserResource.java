package com.glb.training.restfullwebservices.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glb.training.restfullwebservices.model.User;
import com.glb.training.restfullwebservices.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/users")
@RestController
@AllArgsConstructor
public class UserResource {

	private final UserService userService;

	@GetMapping(path = "/")
	public ResponseEntity<List<User>> findAll() {
		log.debug("Getting all users");
		return ResponseEntity.ok(userService.findAll());
	}

}
