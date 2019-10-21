package com.timbuchalka;

/**
 * Created by dev on 2/07/15.
 */
public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;
    private double balance;

    public VipPerson() {
        this("Andrei", 50000.00, "rusuandu@email.com",5000);
    }
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "biutamoise@email.com", 500);
    }

    public VipPerson(String name, double creditLimit, String emailAddress, double balance) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        this.balance= balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
