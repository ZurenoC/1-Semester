package com.company;

public class ferie {

    public static void main(String[] args) {

        int maaned = 12;

        if (maaned == 4) {
            System.out.println("Påskeferie");
        }
        else if (maaned == 7){
            System.out.println("Sommerferie");
        }
        else if (maaned == 8){
            System.out.println("Sommerferie");
        }
        else if (maaned == 10){
            System.out.println("Efterårsferie");
        }
        else if (maaned == 12){
            System.out.println("Juleferie");
        }
        else if (maaned >= 12){
            System.out.println("Hvor mange måneder har du i din kalender???");
        }
        else {
            System.out.println("Hårdt arbejde");
        }




    }
}
