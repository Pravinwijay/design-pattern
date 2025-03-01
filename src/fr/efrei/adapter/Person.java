package fr.efrei.adapter;

public class Person implements IPerson {

    public String name;
    public int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Je m'appelle " + name + " et j'ai " + age + " ans.";
    }

    public void display(){
        System.out.println(this);
    }
}
