import java.util.Scanner;

public class EmpBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for salary
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Take user input for years of service
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        // Initialize bonus to 0
        double bonus = 0.0;

        // Check if years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            bonus = salary * 0.05; 
        }

        // Print the final bonus amount
        System.out.println("The bonus amount is: " + bonus);

        scanner.close();
    }
}