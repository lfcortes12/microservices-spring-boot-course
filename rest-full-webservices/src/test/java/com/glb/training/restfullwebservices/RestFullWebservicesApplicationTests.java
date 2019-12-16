package com.glb.training.restfullwebservices;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.glb.training.restfullwebservices.model.Estimation;

@SpringBootTest
class RestFullWebservicesApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		XmlMapper mapper = new XmlMapper();
		System.out.println(mapper.writeValueAsString(new Estimation()));
	}

}
