import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number > 0) {
            
            // Loop from 1 up to the number
            for (int i = 1; i <= number; i++) {
                
                // 1. Check for multiples of BOTH 3 and 5 first
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // 2. Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // 3. Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                // 4. If none of the above, just print the number
                else {
                    System.out.println(i);
                }
            }
            
        } else {
            // Error message for negative numbers or zero
            System.out.println("Please enter a positive integer greater than 0.");
        }

        scanner.close();
    }
}
