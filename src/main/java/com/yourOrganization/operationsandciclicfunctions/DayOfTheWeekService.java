package com.yourOrganization.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber;
        dayNumber = 7;

        switch (dayNumber) {
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("TGIF!");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
                break;

        }
    }
}
