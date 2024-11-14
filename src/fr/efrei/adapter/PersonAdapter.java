package fr.efrei.adapter;

public class PersonAdapter {
    private String csv;

    public PersonAdapter(String csv) {
        this.csv = csv;
    }

    public Person createPerson(){
        String[] personData = csv.split(";");

        Person person = new Person();
        person.setName(personData[0]);
        person.setAge(Integer.parseInt(personData[1]));
        return person;
    }
}
