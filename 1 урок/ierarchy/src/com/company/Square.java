package com.company;

public class Square {

    private double h;

    Square(double h){
        this.h = h;
    }

    protected double getArea(){
        return h * h;
    }

    protected double getH() {
        return h;
    }

    protected void setH(double h) {
        this.h = h;
    }

}
