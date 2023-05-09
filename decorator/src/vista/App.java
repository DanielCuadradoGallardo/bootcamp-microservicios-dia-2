package vista;

import interfaces.PersonInterface;
import modelo.GenderDecorator;
import modelo.Person;

public class App {

	public static void main(String[] args) {
		PersonInterface person = new Person("Daniel", 22);
		System.out.println(person.presentacion());

		PersonInterface personaDecorada = new GenderDecorator(person, "hombre");
		System.out.println(personaDecorada.presentacion());
	}

}
