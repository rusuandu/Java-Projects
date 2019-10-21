package com.converterMegabytes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

	    System.out.println("Enter your name:");
	    String nume = scanner.nextLine();
        System.out.println("Your name is: " + nume);

        int age = 2019 - yearOfBirth;
        System.out.println("You have " + age + " years old");

	    scanner.close();
    }
}
