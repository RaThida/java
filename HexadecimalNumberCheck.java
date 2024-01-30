import java.util.Scanner;

public class HexadecimalNumberCheck {
    public static void main(String[]args){
        //create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        //ask user to enter the value
        System.out.println("Please enter a value: ");
        // read the value from the user input
        String input = scanner.nextLine();
        //check if the value of user input is a hexadecimal number or not
        boolean isHexadecimal = isHexadecimal(input);
        //display result of the user input
        if(isHexadecimal){
            System.out.println("Yes, it's hexadecimal number.");
        }else{
            System.out.println("No, it's not hexadecimal number.");
        }
        //colse the scanner
        scanner.close();
    }
    //write the function to check if user input is a hexadecimal number or not
    private static boolean isHexadecimal(String value){
        // using a regular expression to check if the value of user input is a valid hexadecimal number
        return value.matches("[0-9A-Fa-f]+");
    }
}
