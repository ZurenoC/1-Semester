package com.company;

public class methodexample {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(linearMethod(i));
        }

        System.out.println(linearMethod(20));

        System.out.println(roundDown(5.5));
    }

public static int linearMethod(int x)
    {
    return linearMethod(2,x);
    }

public static int linearMethod(int a, int x)
    {
    return a*x - 1;
    }

public static int roundDown(double numberToRound)
    {
    return (int)numberToRound;
    }
}
