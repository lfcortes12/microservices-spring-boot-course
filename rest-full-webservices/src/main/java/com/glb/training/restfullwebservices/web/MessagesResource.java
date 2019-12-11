package com.glb.training.restfullwebservices.web;


import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RequestMapping("/messages")
@RestController
@AllArgsConstructor
public class MessagesResource {
	
	private final MessageSource messageSource;
	
	@GetMapping("hello")
	public String getMessage(final @RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("hello.message", null, locale);
	}

}
