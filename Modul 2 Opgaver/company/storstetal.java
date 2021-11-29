package com.company;

public class storstetal {

    public static void main(String[] args) {

        int[] tal;
        tal = new int[100];
        int maximum = tal[0];
        for (int i = 0; i < tal.length; i++)
        {
            System.out.println(tal[i]);
            if (tal[i] > maximum) {
                maximum = tal[i];
                System.out.println(maximum + " er det største tal fundet");

            }
            System.out.println((i+1));
        }
    }
}
