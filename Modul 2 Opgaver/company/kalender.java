package com.company;

public class kalender {

    public static void main(String[] args) {

        final int[] monthsNormalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        final int[] monthsShotYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] monthsTotal;
        for (int year = 2000 ; year <= 2020 ; year++) {
            boolean leap = year%4==0 && year%400!=0;
            monthsTotal = leap ? monthsShotYear : monthsNormalYear;
            System.out.print(year + ": [ ");
            for (int days: monthsTotal) {
                System.out.print(days + " ");

            }
            System.out.println("]");
        }

    }
}
