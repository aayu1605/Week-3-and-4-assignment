import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get integer input from the user and store it in the age variable
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Check if the person is 18 or older
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        scanner.close();
    }
}
