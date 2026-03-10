import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is part of the Gregorian calendar
        if (year >= 1582) {
            boolean isLeapMethod1 = false;
            
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapMethod1 = true; // Divisible by 400
                    } else {
                        isLeapMethod1 = false; // Divisible by 100, but not 400
                    }
                } else {
                    isLeapMethod1 = true; // Divisible by 4, but not 100
                }
            } else {
                isLeapMethod1 = false; // Not divisible by 4
            }

            // Print result for Part 1
            if (isLeapMethod1) {
                System.out.println("Part 1 (Nested if-else): " + year + " is a Leap Year");
            } else {
                System.out.println("Part 1 (Nested if-else): " + year + " is not a Leap Year");
            }


            boolean isLeapMethod2 = false;
            
            // (Divisible by 4 AND NOT divisible by 100) OR (Divisible by 400)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapMethod2 = true;
            }

            // Print result for Part 2
            if (isLeapMethod2) {
                System.out.println("Part 2 (Logical ops): " + year + " is a Leap Year");
            } else {
                System.out.println("Part 2 (Logical ops): " + year + " is not a Leap Year");
            }

        } else {
            // Error message for years before 1582
            System.out.println("Please enter a year greater than or equal to 1582.");
        }

        scanner.close();
    }
}