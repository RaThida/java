import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCorrect = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = (int) (Math.random() * 11) + 10;
            int num2 = (int) (Math.random() * 11) + 10;
            String operator = randomOperator();
            double answer = Answer(num1, num2, operator);

            System.out.printf("Question %d: What is %d %s %d? = ", i + 1, num1, operator, num2);
            double userAnswer = scanner.nextDouble();

            boolean isCorrect;
            if (userAnswer == answer) {
                isCorrect = true;
            } else {
                isCorrect = false;
                System.out.println("Incorrect. The correct answer is " + answer);
            }

            numCorrect += isCorrect ? 1 : 0;

            if (isCorrect) {
                System.out.println("Correct!");
            }
        }

        // Close the scanner to release resources
        scanner.close();

        System.out.println("You got " + numCorrect + " correct answers out of 5.");
    }

    public static String randomOperator() {
        int randomIndex = (int) (Math.random() * 4);
        String[] operators = {"+", "-", "*", "/"};
        return operators[randomIndex];
    }

    public static double Answer(int num1, int num2, String operator) {
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero. Setting result to 0.");
                }
                break;
        }

        return result;
    }
}
