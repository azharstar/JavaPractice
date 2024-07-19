package controlstatements; // Package declaration

public class LeapYear { // Class declaration

    public static void main(String[] args) { // Main method
        int year = 2029; // Reading the year input by user

        // Checking if the year is a leap year
        if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
            System.out.println(year + " is a Leap Year"); // Printing if the year is a leap year
        }
        else {
            System.out.println(year + " is not a Leap Year"); // Printing if the year is not a leap year
        }
    }
}
