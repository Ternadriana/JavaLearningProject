package com.yourOrganization.autoservicetask;

public class ManageAutoService {
    public static void main (String[] args) {

        Car car1 = new Car("JAVA123");
        Car car2 = new Car("Orange","BMW","X6");
//        System.out.println ("This is No-Argument constructor:" + car1.plateNumber);
        car1.plateNumber = "JAV-123";
//        System.out.println ("This is No-Argument constructor with changed variable:" + car1.plateNumber);
//        car1.carPoblem();
//        System.out.println("This is Parametrized constructor before changing a variable: "
//                + " " + " "  + car2.color + " " + " "  + car2.marke + " " + " " +  car2.model );
        car2.color= "Yellow";
//        System.out.println("This is Parametrized constructor after changing a variable:" + car2.color);
//        System.out.println("This is Parametrized constructor before changing a variable: "
//                + " " + " "  + car2.color + " " + " "  + car2.marke + " " + " " +  car2.model );

        Tool tool1 = new Tool("Tool_1");
        Tool tool2 = new Tool(23.5,8.9);
        tool2.name = "tool_2";
        tool2.weight = 2.5;
//        System.out.println( "O nouă uneltă a fost creată în cadrul programului. Detalii nume unealta: "
//                + tool2.name + " Si greutatea este de: "+  tool2.weight );

        Garage garage1 = new Garage(true);
        garage1.address = "Str. Chisinau 114";
        garage1.name = "AutoMaster";
        garage1.numberOfBoxes = 2;
//        System.out.println( garage1.name +  " is open now! " + garage1.isOpen + " Our Location:  "
//        + garage1.address + " We have " + garage1.numberOfBoxes + " Boxes free");

        Worker worker1 = new Worker("Worker1", false);
//        worker1.yesrsOfWorkerExperience(30);
//        System.out.println("|Worker nema:  " + worker1.name + "| Worker availability:  "
//                + worker1.availability  + "| Worker experience:  " + worker1.yearsOfExp );

        System.out.println(  garage1.name + " | Adress: " + garage1.address +
                " |We are open now: "  + garage1.isOpen);
        car1.carPoblem ();
        worker1.yesrsOfWorkerExperience(30);
        System.out.println("Let me share car info:"  + car2.marke + "|  " +  car2.model +  "| "+ car2.color  ) ;
        System.out.println("Please run the car to Box number: "+ garage1.numberOfBoxes + "\r\n"
                + "We will need this tool to repair your car: " + tool1.name +  "| Price: "
                + tool2.price + "| weight: " + tool2.weight);

    }
}
