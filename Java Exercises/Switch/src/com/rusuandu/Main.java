package com.rusuandu;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int [8];
        for (int i=0; i<myIntArray.length; i++) {
            myIntArray[i]= i*10;
        }
        for (int i=0; i<myIntArray.length; i++) {
            System.out.println("Element " + i + " value is " + myIntArray[i]);
        }
    }
}
