package com.company;

public class dato {

    public static void main(String[] args) {

        double jan11970 = 1631100157;
        double antaldage = 250;

        double antalaar = (int)(jan11970/60/60/24)/365;

        System.out.println("Antal år");
        System.out.println(antalaar);
        System.out.println("og");
        System.out.println("Antal dage");
        System.out.println(antaldage);



    }
}
