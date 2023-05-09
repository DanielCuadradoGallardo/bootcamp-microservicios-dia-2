package com.nttdata.designpatterns.designpatterns.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nttdata.designpatterns.designpatterns.model.Person;

@Configurable
@Configuration
public class PersonConfiguration {
	@Bean(name = "personSingleton")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Person singletonPerson() {
		return new Person();
	}
	@Bean(name = "personPrototype")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Person prototypePerson() {
		return new Person();
	}
}
