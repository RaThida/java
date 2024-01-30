import java.util.Scanner;

public class Exercise8 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();
        
        input.close();

        boolean valid = true;

        // Check for exactly 8 characters
        if (password.length() != 8) {
            valid = false;
            System.out.println("Password is invalid.You must have exactly 8 characters.");
        }

        // Check for only digits and letters
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (!Character.isLetterOrDigit(character)) {
                valid = false;
                System.out.println("Password is invalid.You must consist of only digits and letters.");
                break; // Exit the loop 
            }
        }

        // Check for starting with a digit
        if (!Character.isDigit(password.charAt(0))) {
            valid = false;
            System.out.println("Password is invalid.You must start with a digit.");
        }

        // Check for at least one uppercase letter
        boolean hasUppercase = false;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isUpperCase(character)) {
                hasUppercase = true;
                break;
            }
        }

        if (!hasUppercase) {
            valid = false;
            System.out.println("Password is invalid.You must contain at least one uppercase letter.");
        }

        if (valid) {
            System.out.println("The password is valid.");
        }
    }
}
