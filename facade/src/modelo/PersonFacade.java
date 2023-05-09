package modelo;

import java.util.ArrayList;
import java.util.List;

public class PersonFacade {
    private List<Person> persons;

    public PersonFacade(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> filtraPersonas() {
        List<Person> result = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getAge() >= 20 && person.getAge() <= 30) {
                result.add(person);
            }
        }
        return result;
    }
}
