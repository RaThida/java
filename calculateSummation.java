
// write a program  that calculates the following summation

public class calculateSummation {
    public static void main(String[]args){
        //
        double result = 0;
        int n = 624; 

        // Iterate through the terms

        for (int i = 1; i <= n; i++) {
            // Calculate the current term and add it to the result
            double term = 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1));
            result += term;
        }
        
        // Display the result
       
         System.out.println(" Summation result: " + result);

    }

    
        
      

       
        
        // Display the result
       
        // double summation = 0.0;
        // for(double i = 1.0; i <= 624.0; i++){
        //     summation += 1 / ( Math.sqrt(i)+ Math.sqrt(i+1));
        // }
        // System.out.println("Summation: " + summation);
    

}
