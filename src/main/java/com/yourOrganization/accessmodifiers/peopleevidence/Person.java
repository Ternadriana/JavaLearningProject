package com.yourOrganization.accessmodifiers.peopleevidence;


import com.yourOrganization.accessmodifiers.peopleevidence.protectedresidence.PersonResidence;

public  class Person extends PersonResidence {

    String surname;
    public final long ID;
    private  int age;
    private  char gender;
    public  boolean isRetired;
    // DefaultName.name  = default var no need to extend here but in ChishinauEvidenceCatalog yes
    // PersonResidence.residence = protected var we need to extend

    public Person(String  name, String surname, int id, int age, char gender,
                  String  residence, boolean isRetired){
        DefaultName.name = name;
        this.surname =	surname;
        ID = id;
        this.age = age;
        this.gender = gender;

       PersonResidence.residence = residence;
       // Protected from PersonRsidence can be only initialized in this class
        this.isRetired = isRetired;

        System.out.println("Constructor with long description: ");
    }

    public Person(    String  name, String surname, int id){
        DefaultName.name  = name;
        this.surname =	surname;
        ID = id;

        System.out.println("Constructor with short description: ");
    }

    public void setGender(char entGender) {
        if (entGender == 'M' || entGender == 'F' ){
            this.gender = entGender;
        }
    }

    public char getGender() {
       return this.gender;
       }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


