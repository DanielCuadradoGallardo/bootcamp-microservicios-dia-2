package modelo;

import java.time.LocalTime;

import interfaces.PersonInterface;

public class PersonProxy implements PersonInterface {
    private PersonInterface person;

    public PersonProxy(PersonInterface person) {
        this.person = person;
    }

    @Override
    public String presentacion() {
    	beforePresentacion();
        String presentacion = person.presentacion();
        afterPresentacion();
        
        return presentacion;
    }
    
    private void beforePresentacion() {
    	System.out.println("Method person.presentacion() called at " +LocalTime.now());
    }
    
    private void afterPresentacion() {
    	System.out.println("Method invoked succesfully at " +LocalTime.now());
    }
}
