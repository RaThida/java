
    // public class NextAlphabetConverter {

    //     public static void main(String[] args) {
    //         String inputString = "Hello, World!";
    //         String convertedString = convertToNextAlphabet(inputString);
    //         System.out.println("Original String: " + inputString);
    //         System.out.println("Converted String: " + convertedString);
    //     }
    
    //     public static String convertToNextAlphabet(String input) {
    //         StringBuilder result = new StringBuilder();
    
    //         for (int i = 0; i < input.length(); i++) {
    //             char currentChar = input.charAt(i);
    
    //             // Check if the character is an uppercase letter
    //             if (Character.isUpperCase(currentChar)) {
    //                 result.append((char) ((currentChar - 'A' + 1) % 26 + 'A'));
    //             }
    //             // Check if the character is a lowercase letter
    //             else if (Character.isLowerCase(currentChar)) {
    //                 result.append((char) ((currentChar - 'a' + 1) % 26 + 'a'));
    //             }
    //             // If the character is not a letter, keep it unchanged
    //             else {
    //                 result.append(currentChar);
    //             }
    //         }
    
    //         return result.toString();
    //     }
    // }
    
    public class NextAlphabetConverter {

        public static void main(String[] args) {
            String inputString = "Hello, World!";
            String convertedString = convertToNextAlphabet(inputString);
            System.out.println("Original String: " + inputString);
            System.out.println("Converted String: " + convertedString);
        }
    
        public static String convertToNextAlphabet(String input) {
            char[] chars = input.toCharArray();
    
            for (int i = 0; i < chars.length; i++) {
                char currentChar = chars[i];
    
                // Check if the character is an uppercase letter
                if (Character.isUpperCase(currentChar)) {
                    chars[i] = (char) ((currentChar - 'A' + 1) % 26 + 'A');
                }
                // Check if the character is a lowercase letter
                else if (Character.isLowerCase(currentChar)) {
                    chars[i] = (char) ((currentChar - 'a' + 1) % 26 + 'a');
                }
                // If the character is not a letter, keep it unchanged
            }
    
            return new String(chars);
        }
    }
    
