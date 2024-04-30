package com.yourOrganization.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 30;
        boolean isEqual = num1 == num2;
        System.out.println("num1 == num2 = " + isEqual);
        boolean isNotEqual = num1 != num2;
        System.out.println("num1 != num2 = " + isNotEqual);
        boolean isGreater = num1 > num2;
        System.out.println("num1 > num2 = " + isGreater);
        boolean isLess = num1 < num2;
        System.out.println("num1 < num2 = " + isLess);
        boolean isGreaterOrEqual = num1 >= num2;
        System.out.println("num2 >= num1 = " + isGreaterOrEqual );
        boolean isLessOrEqual = num1 < num2;
        System.out.println("num2 <= num1 = " + isLessOrEqual);
    }
}
