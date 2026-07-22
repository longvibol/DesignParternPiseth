package com.pisethjavaschool.factory_pattern_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pisethjavaschool.builder.springDemo")
public class FactoryPatternSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryPatternSpringbootApplication.class, args);
	}
}