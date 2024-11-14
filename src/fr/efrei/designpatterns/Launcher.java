package fr.efrei.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    private static final int MAX_PERSONS = 3;

    public static void main(String[] args) {
        Person person1 = new Person("Ayoub", 21);
        Person person2 = new Person("Bob", 32);
        person1.afficher();

        Person[] persons = new Person[3];
        persons[0] = new Person("Jonathan", 12);
        persons[1] = new Person("Lionel", 32);
        persons[2] = new Person("Cristiano", 36);

        for (int i = 0; i < MAX_PERSONS; i++) {
            persons[i].afficher();
        }

        List<Person> myPersons = new ArrayList<>();
        myPersons.add(new Person("Bin Laden", 45));
    }
}
