package com.rusuandu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduceti numerele:");

                int sum=0;
                int x=0;

                while(true) {
                    boolean isInt = scanner.hasNextInt();
                    if (isInt) {
                        int number = scanner.nextInt();
                        x++;
                        sum+=number;
                    }else{
                        long avg=Math.round((double) sum / (double) x);
                        System.out.println("SUM = "+sum+" AVG = "+avg);
                        break;
                    }
                    scanner.nextLine();
                }
                scanner.close();
            }

        }
