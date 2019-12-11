package com.glb.training.restfullwebservices.web;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RequestMapping("/messages")
@RestController
@AllArgsConstructor
public class MessagesResource {
	
	private final MessageSource messageSource;
	
	@GetMapping("hello")
	public String getMessage() {
		return messageSource.getMessage("hello.message", null, LocaleContextHolder.getLocale());
	}

}
