package com.company;

public class Main {

    public static void main(String[] args) {

	    Person personAlex = new Person(true, "Alex");
	    Person personVika = new Person(false, "Vika");
	    Person personVanya = new Person(true, "Vanya");
	    Person personMasha = new Person(false, "Masha");

        personAlex.marry(personVika);
        personVanya.marry(personMasha);

        System.out.println(personAlex.marry(personVanya));
        System.out.println("sadgas");
    }
}
