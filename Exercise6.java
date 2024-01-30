import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter a sentence : ");
    String str = input.nextLine();
    input.close();
    
    String result = " ";
    
    for(int i = 0; i< str.length(); i++ ){
      // Extract the current character as a string
        String ch = " " + str.charAt(i);
      // Check if the result string already contains the current character
        if(result.contains(ch)){
      // If the character is already in the result string,skip to the next iteration continue;
            continue;
        }
        result += ch;
    }
    System.out.println(result);
  }
}
