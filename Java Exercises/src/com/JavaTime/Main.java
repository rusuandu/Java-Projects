package com.JavaTime;

import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("Mili seconds from 1 Januray 1970: "+ date.getTime());

        System.out.println("year from epoch: " + date.getYear());
        System.out.println("month from year: " + date.getMonth());
        System.out.println("day from week: " + date.getDay());
        System.out.println("Hours from day: " + date.getHours());
        System.out.println("minutes from hours: " + date.getMinutes());
        System.out.println("seconds from minutes: " + date.getSeconds());


    }
}
