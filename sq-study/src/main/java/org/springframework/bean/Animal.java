package org.springframework.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Animal {
    private String name;
    private String sex;

    @Autowired
    private Person person;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
