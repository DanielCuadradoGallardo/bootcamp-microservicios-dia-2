package vista;

import modelo.Person;

public class App {

	public static void main(String[] args) {
		Person person = Person.getInstance();
		System.out.println(person);
		
		person.setName("Daniel Cuadrado Gallardo");
		person.setAge(22);
		System.out.println(person);
		
		Person person2 = Person.getInstance();
		System.out.println(person2);
	}

}
