package modelo;

import interfaces.PersonInterface;

public class GenderDecorator implements PersonInterface {
    private PersonInterface person;
    private String gender;

    public GenderDecorator(PersonInterface person, String gender) {
        this.person = person;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return person.toString() + ", gender=" + gender + "]";
    }

    @Override
    public String presentacion() {
        return person.presentacion() + " Soy " + gender + ".";
    }
}
