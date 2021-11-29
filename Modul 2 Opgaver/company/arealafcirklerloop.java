package com.company;

import java.util.Scanner;

public class arealafcirklerloop {

    public static void main(String[] args) {

        while(true) {
            System.out.println("Skriv radius");
            Scanner sc = new Scanner(System.in);
            double input = sc.nextDouble();
            final double pi = 3.14159;
            System.out.println("Arealet er " + (pi * input * input));
        }




    }
}
