import java.util.Scanner;

public class Excercise7 {
    public static void main(String[]args){
        //create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        //ask user to enter the sentence
        System.out.println("please enter the sentence: ");
        // read a sentence from the user 
        String inputSentence = scanner.nextLine();

        //capitalize the character of each word in the sentence that user input
        String capitalizedSentence = capitalizeCharacter(inputSentence);

        // display the result
        System.out.println("The result ater capitalized: " + capitalizedSentence);
        //close the scanner
        scanner.close();

    }
    // write the function to capitalize the first character of each words in the sentence
    private static String capitalizeCharacter(String sentence) {
        //split the sentence into the words
        String[] words = sentence.split(" ");
        //start to capitalize the first character of each word
        StringBuilder result = new StringBuilder();
        //using for loop
        for(String word : words){
            //to check whether a string or the word of user input is empty or not
            if(!word.isEmpty()){
                //Capitalize the first character and append the rest in lowercase
                result.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase())
                .append(" ");
            }
        }
        //remove the trailing space and return the result
        return result.toString().trim();

    }
}
