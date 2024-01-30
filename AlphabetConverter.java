
// Convert each alphabet of a string into its next alphabet and print the string.

public class AlphabetConverter {
    public static void main(String[]args){
       String inputString = "Welcom to java";
       String convertedString = convertToNextAlphabet(inputString); 
    System.out.println("The main String: " + inputString);
    System.out.println("String converted: " +convertedString);

    }
    public static String convertToNextAlphabet(String input){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            char currentChar = input.charAt(i);

            // Check if the character is an uppercase letter
            if(Character.isUpperCase(currentChar)){
                result.append((char) ((currentChar - 'A' + 1) % 26 + 'A'));
            }

            // Check if the character is a lowercase letter
            else if(Character.isLowerCase(currentChar)){
                result.append((char) ((currentChar - 'a' +1) % 26 + 'a'));
            }

            // If the character is not a letter, keep it unchanged
            else{
                result.append(currentChar);
            }
        }
        return result.toString();
    }
    

}

