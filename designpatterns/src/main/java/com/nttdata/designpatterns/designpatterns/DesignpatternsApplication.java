package com.nttdata.designpatterns.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nttdata.designpatterns.designpatterns.configuration.PersonConfiguration;
import com.nttdata.designpatterns.designpatterns.model.Person;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DesignpatternsApplication.class, args);

        PersonConfiguration personConfiguration = context.getBean(PersonConfiguration.class);
        
        Person person = personConfiguration.singletonPerson();
        person.setName("Daniel");
        person.setAge(22);
        System.out.println("Persona 1: " +person);
        
        Person person2 = personConfiguration.singletonPerson();   
        System.out.println("Persona 2: " +person2);
        
        Person person3 = personConfiguration.prototypePerson();     
        System.out.println("Persona 3: " +person3);

        Person person4 = Person.builder().name("Francisco").age(24).build();
        System.out.println("Persona 4: " +person4);

        context.close();
	}
}
