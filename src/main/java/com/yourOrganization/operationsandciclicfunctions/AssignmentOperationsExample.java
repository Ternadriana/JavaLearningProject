package com.yourOrganization.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;
        int result = num1;
        System.out.println("Assigning = " + result);
        result += num2;
        System.out.println("Addition + Assigning = " + result);
        result -= num2;
        System.out.println("Subtracting + Assigning = " + result);
        result *= num2;
        System.out.println("Multiplying + Assigning = " + result);
        result /= num2;
        System.out.println("Dividing + Assigning = " + result);
        result %= num2 ;
        System.out.println("Moduling + Assigning = " + result);
    }
}
