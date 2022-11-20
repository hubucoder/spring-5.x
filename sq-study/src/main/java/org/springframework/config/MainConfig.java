package org.springframework.config;

import org.springframework.bean.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.bean.Person;

@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		return new Person("wang", 11);
	}

	@Bean
	public Animal animal() {
		return new Animal("dog", "mail");
	}
}
