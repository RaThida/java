import java.util.Scanner;
public class enteredNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int lastNumber = 0;
        while(true){
            System.out.print("Enter a umber: ");
            int inputNumber = scanner.nextInt();
            if(inputNumber > 5){
                lastNumber = inputNumber;
                break;
            }
            System.out.println("Number is not greater than 5. try again.");
        }
        System.out.println("The last number you sentered was"+ lastNumber);
        scanner.close();
    }
}
