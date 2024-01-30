import java.util.Scanner;
public class TotalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize variables
        int total = 0;
        char AddAnother;

        do {
            // Ask the user to enter the first number
            System.out.print("Enter a number: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter a number: ");
                input.next(); // consume the invalid input
            }
            int firstNumber = input.nextInt();

            // Prompt the user to enter the second number
            System.out.print("Enter another number: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter another number: ");
                input.next(); // consume the invalid input
            }
            int secondNumber = input.nextInt();

            // Add the two numbers to the total
            total += (firstNumber + secondNumber);

            // Ask if the user wants to add another number
            System.out.print("Do you want to add another number? (y/n): ");
            AddAnother = input.next().charAt(0);

        } while (AddAnother == 'y' || AddAnother == 'Y');

        // Display the total
        System.out.println("The total sum is: " + total);

        // Close the scanner
        input.close();
    }
}

