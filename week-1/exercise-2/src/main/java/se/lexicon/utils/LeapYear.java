package se.lexicon.utils;

import java.util.Scanner;

public class LeapYear {

    private LeapYear() {}

    public static LeapYear instance;

    public static synchronized LeapYear init() {
        return instance == null
                ? instance = new LeapYear()
                : instance;
    }

    public static void run(){
        int year = readInput(new Scanner(System.in));
        String u = isLeapYear(year);
        System.out.print(u);
    }

    private static int readInput(Scanner scanner){
        do {
            System.out.print("Enter year: ");
            while(!scanner.hasNextInt()){
                System.out.print("\t\tInvalid Input!\nEnter year: ");
                scanner.next();
            }
            return scanner.nextInt();
        } while(true);
    }

    public static String isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
                ? "Year " + year + " is Leap Year"
                : "Year " + year + " is not a Leap Year";
    }
}
