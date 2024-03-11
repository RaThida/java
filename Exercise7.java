import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        int number1;
        int number2;
        int answer;
        int userAnswer;
        int numCorrect = 0;
        int numWrong = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            // Generate two random numbers
            number1 = (int) (Math.random() * 100);
            number2 = (int) (Math.random() * 100);

            System.out.print("What is " + number1 + " + " + number2 + "? ");
            userAnswer = input.nextInt();

            // Calculate the correct answer
            answer = number1 + number2;

            // Check the answer
            while (userAnswer != answer) {
                System.out.println("Wrong answer. Try again.");

                // Check if user entered the same wrong answer again
                int answer1 = userAnswer;
                userAnswer = input.nextInt();
                if (userAnswer == answer1) {
                    System.out.println("You already entered " + userAnswer + ". Please try a different answer.");
                }
                numWrong++;
            }

            System.out.println("You got it!");
            numCorrect++;

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        input.close();

        System.out.println("You got " + numCorrect + " correct answers.");
        System.out.println("You got " + numWrong + " wrong answers.");
    }
}