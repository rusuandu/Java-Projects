package com.converterMegabytes;

public class Main {

    public static void main(String[] args) {
            int kiloBytes = -8;
            int megaBytes= kiloBytes/1024;
            int remainingkb = kiloBytes % 1024;
            if (kiloBytes<=0) {
                System.out.println("Invalid value");
            } else {
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingkb + " KB");
            }
    }
}

