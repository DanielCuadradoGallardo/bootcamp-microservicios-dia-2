package vista;

import java.util.ArrayList;
import java.util.List;
import modelo.Person;
import modelo.PersonFacade;

public class App {

	public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Daniel", 22));
        persons.add(new Person("Maria", 26));
        persons.add(new Person("Carlos", 35));
        persons.add(new Person("Javier", 17));

        PersonFacade facade = new PersonFacade(persons);
        List<Person> filtroPersonas = facade.filtraPersonas();

        for (Person person : filtroPersonas) {
            System.out.println(person);
        }
	}

}
