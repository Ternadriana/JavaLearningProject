package com.yourOrganization.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("!(a || b) = " + !(a || b));
        System.out.println("!(a || b) = " + !!(a || b));
    }
}
