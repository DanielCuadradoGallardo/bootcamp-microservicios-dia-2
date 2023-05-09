package vista;

import interfaces.PersonInterface;
import modelo.Person;
import modelo.PersonProxy;

public class App {

	public static void main(String[] args) {
		PersonInterface person = new Person("Daniel", 22);
		PersonProxy personproxy = new PersonProxy(person);
		System.out.println(personproxy.presentacion());

	}

}
