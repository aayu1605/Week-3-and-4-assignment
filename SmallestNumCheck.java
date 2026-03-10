import java.util.Scanner;

public class SmallestNumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for the three numbers
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();

        // Check if the first number is smaller than the other two
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Print the result matching the requested Output (O/P) format
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        scanner.close();
    }
}
