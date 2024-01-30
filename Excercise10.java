import java.util.Scanner;

public class Excercise10 {
    public static void main(String[] args){
        //create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        //ask user to enter a sentence
        System.out.println("Please enter a sentence: ");
        // read the sentence from the user input
        String sentence = scanner.nextLine();

        int vowels = 0, consonant = 0, special_character = 0,  
        digit = 0; 
        sentence = sentence.toLowerCase();
        // using for loop 
        for(int i = 0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            // check if character is any vowels a,e,i,o,u
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               ++vowels; 
            }
            //check if character is in between a to z
            else if((ch >= 'a' && ch <='z')){
                ++consonant;
            }
            //check if character is a digit between 0 to 9
            else if(ch >= '0' && ch <= '9'){
                ++digit;
            }
            // check if character is a specialcharacter
            else if(ch == ' ' || ch == '!' || ch == '@' || ch == '#'
            || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '.'){
                ++special_character;
            }
        }
        //display the results
        System.out.println(" consonants: " + consonant);
        System.out.println("vowels: " + vowels);
        System.out.println("digits: " + digit);
        System.out.println(" special characters: " + special_character);
        //colse scanner
        scanner.close();
    }
    
}
