import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the result, initially assuming the number is prime
        boolean isPrime = true;

        // Prime numbers are strictly greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 up to (but not including) the user input number
            for (int i = 2; i < number; i++) {
                
                // Check if the number is perfectly divisible by 'i'
                if (number % i == 0) {
                    isPrime = false; // It's not a prime number
                    break;           // Exit the loop immediately
                }
            }
        }

        // Print the final result based on the boolean variable
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}