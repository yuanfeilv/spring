package com.ambity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mytest1 {
	@Bean
	public Car car(){
		return new Car();
	}
}
