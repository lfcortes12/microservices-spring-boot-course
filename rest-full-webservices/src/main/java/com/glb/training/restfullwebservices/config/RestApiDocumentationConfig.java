package com.glb.training.restfullwebservices.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@OpenAPIDefinition(
        info = @Info(
                title = "Spring Training",
                version = "1.0",
                description = "API for learning Spring",
                license = @License(name = "Apache 2.0", url = "http://foo.bar"),
                contact = @Contact(url = "https://company.com", name = "company", email = "lfcortes12@gmail.com")
        )
)
@Configuration
public class RestApiDocumentationConfig {

}
