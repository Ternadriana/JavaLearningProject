package com.yourOrganization.autoservicetask;

public class Car {

    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String marke;
    String model;
// Default constructor:
// null
// No-Argument constructor:
    public Car (String plateNumber1){
        this.plateNumber = plateNumber1;
    }
//Parametrized constructor:
    public Car( String color1, String marke1,String model1){
         this.color = color1;
         this.marke = marke1;
         this.model = model1;
    }
// Method:
    public void carPoblem () {
        System.out.println("My car has problems!");
    }
}
