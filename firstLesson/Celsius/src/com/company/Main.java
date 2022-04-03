package com.company;

public class Main {

    public static void main(String[] args) {
        double celsius = -10;

        System.out.println(converterFahrenheit(celsius));
        System.out.println(converterKelvin(celsius));
    }

    static double converterFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    static double converterKelvin(double celsius){
        return celsius + 271.15;
    }
}
