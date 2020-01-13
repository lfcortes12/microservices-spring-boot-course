package com.glb.training.restfullwebservices.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.glb.training.restfullwebservices.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	protected static final List<User> users;

	static {
		users = Stream.of(User.builder().id(1).name("Luis").username("luis").password("pass1").build())
				.collect(Collectors.toList());
	}

	public List<User> findAll() {
		log.debug("Getting all users");
		return users;
	}

}
