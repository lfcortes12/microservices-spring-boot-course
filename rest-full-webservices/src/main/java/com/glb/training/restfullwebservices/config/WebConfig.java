package com.glb.training.restfullwebservices.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebConfig {
   
   @Bean
   LocaleResolver localeResolver() {
      final SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
      sessionLocaleResolver.setDefaultLocale(Locale.US);
      
      return sessionLocaleResolver;
   }
   
   @Bean
   ResourceBundleMessageSource bundleMessageSource() {
      final ResourceBundleMessageSource  bundleMessageSource = new ResourceBundleMessageSource();
      bundleMessageSource.setBasename("messages");
      return bundleMessageSource;
   }

}
