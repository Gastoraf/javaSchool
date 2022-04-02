package com.company;

public class Circle extends Square{

    Circle(double h) {
        super(h);
    }


    protected double getArea(){
        return 3.14 * getH();
    }


    @Override
    protected double getH() {
        return super.getH();
    }

    @Override
    protected void setH(double h) {
        super.setH(h);
    }
}
