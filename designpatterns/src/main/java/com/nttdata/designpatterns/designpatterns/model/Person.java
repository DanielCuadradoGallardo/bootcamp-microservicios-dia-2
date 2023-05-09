package com.nttdata.designpatterns.designpatterns.model;

import lombok.*;

import java.util.Objects;

@Builder
@ToString
@Getter
@Setter
@Data
public class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    public Person() {

    }
	
}