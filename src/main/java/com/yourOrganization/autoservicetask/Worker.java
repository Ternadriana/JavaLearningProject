package com.yourOrganization.autoservicetask;

public class Worker {

    String name;
    int yearsOfExp;
    boolean availability;


    public Worker(String wName,boolean wAvailability ){
        name = wName;
        availability = wAvailability;
    }

    public void yesrsOfWorkerExperience (int age){
        yearsOfExp = age - 20;
        System.out.println("Our Worker has " + yearsOfExp + " years of experience. ");
    }
}
