package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit, "Sydeny");
        addInOrder(placeToVisit, "Melbourne");
        addInOrder(placeToVisit, "Brisbane");
        addInOrder(placeToVisit, "Canberra");
        addInOrder(placeToVisit, "Perth");
        addInOrder(placeToVisit, "Aleaide");
        addInOrder(placeToVisit, "Darwin");
        addInOrder(placeToVisit, "Alice Springs");

        printList(placeToVisit);

        printList(placeToVisit);
        visit(placeToVisit);


    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visting " + i.next());
        }

        System.out.println("============================");
    }

    private static boolean addInOrder( LinkedList<String> linkedList,String newCity ) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                // equal, do not add;
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparison > 0) {
                // new city should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
        }
        else if (comparison < 0) {
                // move on the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward=true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Now holiday is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println(" Now visting " + listIterator.next());
                    } else {
                        System.out.println("Reach the end of the list");
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println(" Now visting " + listIterator.previous());
                    } else {
                        System.out.println(" We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu () {
        System.out.println("Available options: \npress");
        System.out.println("0-to quit\n" +
                "1-go to the next city\n" +
                "2-go to previous city\n" +
                "3-print menu options");
    }





















}
