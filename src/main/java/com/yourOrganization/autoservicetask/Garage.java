package com.yourOrganization.autoservicetask;

public class Garage {

    String address;
    String name;
    int numberOfBoxes;
    boolean isOpen;

    public Garage(boolean isOpen1){
        this.isOpen = isOpen1;
        System.out.println("Hello and welcome to our Gareage! ");
    }
}
