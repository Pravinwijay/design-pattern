package fr.efrei.adapter;

import fr.efrei.designpatterns.Person;

public class Launcher {
    public static void main(String[] args) {
        String[] people = {"Bob;22", "Clair;29", "Batard;87"};

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);

            Person person = new Person(people[i]);
            PersonAdapter personAdapter = new PersonAdapter(people[i]);
            person.display();
        }
    }
}