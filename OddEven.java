import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the input is a Natural Number (greater than 0)
        if (number > 0) {
            
            // Iterate from 1 up to the number entered by the user
            for (int i = 1; i <= number; i++) {
                
                // Check if the current number 'i' is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
            
        } else {
            // Error message if the user enters 0 or a negative number
            System.out.println("Please enter a Natural Number (greater than 0).");
        }

        scanner.close();
    }
}
