import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String value = input.nextLine().toUpperCase();

        input.close();

        boolean isHexadecimal = true;
        int decimalPointCount = 0;

        // Check each character in the value:
        for (char c : value.toCharArray()) {
            if (c == '.') {
                decimalPointCount++;
                if (decimalPointCount > 1) { // More than one decimal point is invalid
                    isHexadecimal = false;
                    break;
                }
            } else if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                isHexadecimal = false;
                break;
            }
        }

        if (isHexadecimal) {
            System.out.println("Yes, it's a hexadecimal number.");
        } else {
            System.out.println("No, it's not a hexadecimal number.");
        }
    }
}
