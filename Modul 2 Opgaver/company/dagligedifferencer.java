package com.company;

public class dagligedifferencer {

    public static void main(String[] args) {

        double mandag = 21.5;
        double tirsdag = 23.7;
        double onsdag = 19.6;
        double torsdag = 22.5;
        double fredag = 25.3;
        double loordag = 21.7;
        double soondag = 18.9;

        double mandagtirsdag = mandag - tirsdag;
        double tirsdagonsdag = tirsdag - onsdag;
        double onsdagtorsdag = onsdag - torsdag;
        double torsdagfredag = torsdag - fredag;
        double fredagloordag = fredag - loordag;
        double loordagsoondag = loordag - soondag;
        double soondagmandag = soondag - mandag;

        System.out.println(mandagtirsdag);
        System.out.println(tirsdagonsdag);
        System.out.println(onsdagtorsdag);
        System.out.println(torsdagfredag);
        System.out.println(fredagloordag);
        System.out.println(loordagsoondag);
        System.out.println(soondagmandag);

    }
}
