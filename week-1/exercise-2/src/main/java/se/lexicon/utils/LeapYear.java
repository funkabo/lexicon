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
        int input = readInput(new Scanner(System.in));
        String result = isLeapYear(input);
        System.out.print(result);
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

    public static String isLeapYear(int input){
        return input % 4 == 0 && input % 100 != 0 || input % 400 == 0
                ? "Year " + input + " is Leap Year"
                : "Year " + input + " is not a Leap Year";
    }
}
