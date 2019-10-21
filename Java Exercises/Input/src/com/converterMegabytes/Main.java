package com.converterMegabytes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt)
        {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int Age = 2019 - yearOfBirth;

            if (Age >= 0 && Age <= 100) {
                System.out.println("Your name is " + name + ",and you are " + Age + " years old.");
            } else {
                System.out.println("Invalid year of birthday");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();

    }
}
