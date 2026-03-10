import java.util.Scanner;

public class LargestNumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs for the three numbers
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();

        // Check which number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // Print the results matching the requested Output (O/P) format
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        scanner.close();
    }
}