package org.springframework.study;

import mainConfig.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testAnno {

	@Test
	public void main () {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
}
