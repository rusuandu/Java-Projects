package com.AutoboxingAndUnboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Andrei");

        Integer integer = new Integer(54);
        Double doubleValue = new Double(23.45);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        Integer myIntValue = 56; //Integer.valueOf(56)
        int myInt = myIntValue.intValue(); //myIntValue.intValue();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "->" + intArrayList.get(i).intValue());
        }

        System.out.println("-----------------");


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " -> " + value);
        }
    }
}
