import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
        // This will result in 'true' if the remainder is 0, and 'false' otherwise
        boolean isDivisible = (number % 5 == 0);

        // Print the result matching the requested Output (O/P) format
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        scanner.close();
    }
}