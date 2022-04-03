package com.company;

public class Triangle extends Square{
    private double a;

    Triangle(double h, double a) {
        super(h);
        this.a = a;
    }


    protected double getArea() {
        return a * getH() * 0.5;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
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
