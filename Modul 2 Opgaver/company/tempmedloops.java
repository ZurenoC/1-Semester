package com.company;

public class tempmedloops {

    public static void main(String[] args) {

        double celcius = -5.0;

        for(double start = -5; start<86; start++){
            double fahrenheit = 32.0 + 9.0/5.0*celcius;
            System.out.println(celcius + " Celsius er "+ fahrenheit + " Fahrenheit");
            celcius += 0.5;
        }



    }
}
