package org.springframework;

import org.springframework.bean.Animal;
import org.springframework.bean.Person;
import org.springframework.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean.getName());

        Animal animal = context.getBean(Animal.class);
        System.out.println(animal.getName());
    }
}
