package com.converterMegabytes;


public class Main {

    public static void main(String[] args) {
	// write your code here

        VipCustomer person1= new VipCustomer ();
        System.out.println("Name:" + person1.getEmailAdress());

        VipCustomer person2= new VipCustomer ("Ion", 25000);
        System.out.println(person2.getEmailAdress());

        VipCustomer person3= new VipCustomer ("gigi", 15000, "gigi@email.com");
        System.out.println(person3.getEmailAdress());
    }
}
