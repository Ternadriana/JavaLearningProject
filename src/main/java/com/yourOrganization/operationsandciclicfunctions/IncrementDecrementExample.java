package com.yourOrganization.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int num1 = 1;
        int numPreIncr = ++num1;
        System.out.println( "1. Variable value before applying PreIncrementation: "  + numPreIncr +
                " , and Variable after: " + num1 );
        int num2 = 1;
        int numIncr = num2++;
        System.out.println( "2. Variable value before applying PostIncrementation: "  + numIncr +
                " , and Variable after: " + num2 );
        int num3 = 10;
        int numPreDecr = --num3;
        System.out.println( "3. Variable value before applying PreDecrement: "  + numPreDecr +
                " , and Variable after: " + num3 );
        int num4 = 10;
        int numDecr = num4--;
        System.out.println( "4. Variable value before applying PostDecrement: "  + numDecr +
                " , and Variable after: " + num4 );

    }
}
