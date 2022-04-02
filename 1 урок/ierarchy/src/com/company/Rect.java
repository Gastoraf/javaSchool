package com.company;

public class Rect extends Square{
    private double length;

    Rect(double h, double length) {
        super(h);
        this.length = length;

    }

    protected double getArea(){
        return length * getH();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    protected void setH(double h) {
        super.setH(h);
    }

    @Override
    protected double getH() {
        return super.getH();
    }
}
