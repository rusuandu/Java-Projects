package com.JavaInterfaces;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action take,desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the deskphone");
            isRinging=false;
        }


    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber==myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
