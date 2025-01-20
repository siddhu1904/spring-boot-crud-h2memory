package com.example.rjany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
//@EnableWebMvc
public class SpringEmbeddedH2DbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmbeddedH2DbApplication.class, args);
	}

}
