package org.springframework.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name;
	private int age;

	@Autowired
	private Animal animal;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "org.springframework.study.Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
