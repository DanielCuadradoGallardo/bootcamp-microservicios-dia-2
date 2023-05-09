package vista;

import modelo.Person;

public class App {

	public static void main(String[] args) {
		Person person = new Person.Builder().name("Daniel Cuadrado Gallardo").age(22).build();
		System.out.println(person);
		
		Person person2 = new Person.Builder().age(22).build();
		
		System.out.println(person2);
	}
}
