// write a program that reads an unspecified number of integers

import java.util.Scanner;// we import java.util.Scanner to read input from carious sources.

public class DisplayTotal {
    // and computes the total and average of the input values. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;// Count the number of positive numbers
        int negativeCount = 0;// Count the number of negative numbers
        int total = 0;
        while(true){
            // Read an integer from the user
            
            System.out.print("Enter an integer, the input ends if it is 0: \n");
            int num = scanner.nextInt();

            // Check if the entered number is 0 to end the loop

            if(num==0){
                break;

            }
            // Update counts and total based on the sign of the number

            if(num>0){
                positiveCount++;
            }
            else if(num<0){
                negativeCount++;

            }
            total += num;

        }
        // Calculate average, handling the case when the count is 0 to avoid division by 0

        double average = (positiveCount + negativeCount == 0) ? 0 : (double) total / (positiveCount + negativeCount);

        //display the total number of positive integers, 

        System.out.println("Total positive integers: " + positiveCount);

        // the toal number of negative integers, the toal,

        System.out.println("Total negative integers: " + negativeCount);
        System.out.println("Total: " + total);

        // and the average as a floating-point number.

        System.out.println("Average: " + average);

        scanner.close();

    }
}






