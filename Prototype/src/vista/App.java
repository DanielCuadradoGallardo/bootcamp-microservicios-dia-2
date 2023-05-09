package vista;

import modelo.Person;

public class App {

	public static void main(String[] args) {
		Person person = new Person("Daniel Cuadrado Gallardo", 22);
		
		Person person2 = null;
		try {
			person2 = (Person) person.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(person2);
	}

}
