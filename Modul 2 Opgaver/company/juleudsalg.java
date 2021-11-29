package com.company;

public class juleudsalg {
    public static void main(String[] args) {

        double sek = 9;
        double startdec = 28512000;
        double slutdec = 31104000;

        double pris = 599.95;


        if (sek > startdec) {
            System.out.println("Tilbud " + pris * 0.7);
        }
        else if (sek <= startdec){
            System.out.println(pris);
        }
        else if (sek >= slutdec) {
            sek = 0;
            System.out.println(pris);
        }




    }
}
