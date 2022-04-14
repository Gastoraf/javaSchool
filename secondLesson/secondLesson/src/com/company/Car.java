package com.company;

public class Car {
    private String model;
    private String type;


    Car(String model, String type){
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "'model = " + model +
                ", type = " + type + '\'';

    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}