package com.yourOrganization.methodstask;

public class ExecutionService {
    public static void main (String[] args){

        int randomIt = DataGeneratorUtil.getRandomInt(150,350);
        System.out.println("1.Var randomIt: " + randomIt);

        int randomIt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("2.Var randomIt: " + randomIt1);

        double randomBouble = DataGeneratorUtil.getRandomDouble(150.0);
        System.out.println("3.Var randomDouble: " + randomBouble);

        System.out.println("4.Var randomBoolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("5. Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("6. Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("7. Random Valid String de x chars: " + DataGeneratorUtil.generateValidRandomString(7));
        System.out.println("8. Random Invalid String de x chars: " + DataGeneratorUtil.generateInvalidRandomString(4));

        System.out.println("------------------------------------");
        Customer ionConsumer = new Customer("Ion Sirbu", 26,"ion.boss@gmail.com");
        System.out.println("Numele: " + ionConsumer.getName());
        System.out.println("Age: " + ionConsumer.getAge());
        System.out.println("email: " + ionConsumer.getEmail());

        ionConsumer.setName("Marcel marcel");
        ionConsumer.setAge(126);
        ionConsumer.setEmail("marcel@gmail.com");

        System.out.println("Update Numele: " + ionConsumer.getName());
        System.out.println("Update Age: " + ionConsumer.getAge());
        System.out.println("Update email: " + ionConsumer.getEmail());

Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(12),
        DataGeneratorUtil.getRandomInt(127),DataGeneratorUtil.getRandomEmail());

System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(4));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(127));
        randomDataCustomer.setName(DataGeneratorUtil.getRandomEmail());
    }
}
