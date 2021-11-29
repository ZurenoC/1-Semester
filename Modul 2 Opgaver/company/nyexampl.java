package com.company;

public class nyexampl {

    public static void main(String[] args) {
        int[] myLittleArray = new int[200];
        fill(myLittleArray, 6);
        for(int i = 0; i <myLittleArray.length; i++)
        {
            System.out.print(myLittleArray[i]);
        }
    }

    public static void fill(int[] arr, int j)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = j;
        }
    }
}
