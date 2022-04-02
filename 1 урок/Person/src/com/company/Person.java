package com.company;

public class Person {

    //гендер
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {


        if ((this.spouse != person) && (person.man != this.man)){

            if (person.spouse != null){
                person.divorce();
            }

            if (this.spouse != null){
                this.divorce();
            }

            person.spouse = this;
            this.spouse = person;
            return true;
        }
        return false;
    }

    public boolean divorce() {
        if (spouse != null){
            spouse.spouse = null;
            this.spouse = null;
            return true;
        }
        return false;
    }



}
