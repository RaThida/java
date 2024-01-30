// Convert each alphabet of a string into its next alphabet and print the string.
public class StringConverter {
   
        public static void main(String[] args) {
           String inputString = "Welcome to JAVA";
           String convertedString = convertIntoNextAlphabet(inputString);
           System.out.println("Input String: " + inputString);
           System.out.println("Output String after converted: " + convertedString);
        }
        public static String convertIntoNextAlphabet(String input){
            //start convert each alphabet
            // we usse input.toCharArray() to convert a string into a charater array.
            char[] chars = input.toCharArray();
            
            //we use int i = 0 to initializes of for loop  before the loop start.
            //and i < chars.length, the condition need to be true to continue iterating.
            for(int i = 0; i < chars.length; i++){
                char currentchar = chars[i];
                
                // Check if the character is an uppercase letter
                if (Character.isUpperCase(currentchar)) {
                    chars[i] = (char) ((currentchar - 'A' + 1) % 26 + 'A');
                }

                // Check if the character is a lowercase letter
                else if (Character.isLowerCase(currentchar)) {
                    chars[i] = (char) ((currentchar - 'a' + 1) % 26 + 'a');
                }
                // If the character is not a letter, keep it unchanged
            }

            //finished the execution of the new string
            return new String(chars);
        }
    }

