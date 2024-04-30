package com.yourOrganization.accessmodifiers;

import com.yourOrganization.accessmodifiers.peopleevidence.Person;
import com.yourOrganization.accessmodifiers.peopleevidence.protectedresidence.PersonResidence;


public class ChisinauEvidenceCatalog  extends PersonResidence  {
    public static void main(String[] args) {

        Person person1 = new Person("Nicu", "Toc", 4567456, 23,
                'M', "Valea Trandafirilor", false);

        person1.setAge(32);
        System.out.println("This peron is " + person1.getAge() + " years old.");

 // Retired validation:

        if (person1.getAge() > 67) {
            person1.isRetired = true;
            System.out.println("This person is retired");
        } else {
            System.out.println("This person is not retired");
        }

        System.out.println(person1.residence);
       // System.out.println(person1.name); //name can be used only in package peopleevidence

/////////////////////////////////////////////////////////////////////////////////////////////

        Person person2 = new Person("Maria", "Roc", 4563678);
        //person2.ID = 4563546; >> if variable is final I can not chang it.
        // person2.surname = " oc"; >> if variable is default I can not access it out of it's package
        // System.out.println( person2.name); >> Same with  printing.
        System.out.println(person2); // >> Person@4554617c I will get only the hash location

/////////////////////////////////////////////////////////////////////////////////////////////

        Person person3 = new Person("Adr", "Ter", 456789, 23,
                'F', "Valea Trandafirilor", false);

        person3.setGender('M'); // >>VALIDE VALUE WILL CHANGE FIRST ONE
        person3.setGender('A');// >> NOT A VALID ONE WILL KEEP TONE FROM ROW 41
        System.out.println(person3.getGender());

    }
}
