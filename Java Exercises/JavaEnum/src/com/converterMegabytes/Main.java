package com.converterMegabytes;

public class Main {

    public static void main(String[] args) {
        Color myColor = Color.YELLOW;
        System.out.println("myColor:" + myColor);
        System.out.println(myColor.rgbValue());

        for(Color c: Color.values()) {
            System.out.println(c);
        }
    }
}
