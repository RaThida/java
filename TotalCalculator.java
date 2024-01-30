import java.util.Scanner;

 class TotalCalculator{
    public static void main(String[]args){
        //create an object of scanner
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while(total <=50){
            System.out.println("Enter a number: ");
            int inputNumber = scanner.nextInt();
            total += inputNumber;
            System.out.println("The total is " + total);

        }
        System.out.println("The total is over 50. loop stopped.");
        scanner.close();

    }
}
