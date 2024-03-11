import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        int totalSimulations = 100;
        int totalSurvivals = 0;

        // Define the different cases with the initial pearl distributions in two bowls
        String[] cases = {
            "WWW,BBB",   
            "WWB,BBW",   
            "WWWBB,B",  
            "WWWB,BB",   
            "WWBBB,W",   
            "BBBW,WW",   
            "WWBB,BW"    
        };

        for (String c : cases) {
            String[] bowls = c.split(",");
            int whiteCount1 = 0;
            int blackCount1 = 0;
            int whiteCount2 = 0;
            int blackCount2 = 0;

            // Count the number of white pearls in bowl 1
            for (char ch : bowls[0].toCharArray()) {
                if (ch == 'W') {
                    whiteCount1++;
                }
            }
            blackCount1 = bowls[0].length() - whiteCount1;

            // Count the number of white pearls in bowl 2
            for (char ch : bowls[1].toCharArray()) {
                if (ch == 'W') {
                    whiteCount2++;
                }
            }
            blackCount2 = bowls[1].length() - whiteCount2;

            int survivalCount = 0;
            for (int i = 0; i < totalSimulations; i++) {
                // Randomly choose a bowl to pick from
                int bowl = new Random().nextInt(2) + 1;
                int pearl;
                // Pick a pearl from the chosen bowl
                if (bowl == 1) {
                    int randomNum = new Random().nextInt(whiteCount1 + blackCount1);
                    if (randomNum < whiteCount1) {
                        pearl = 1; // White pearl picked from bowl 1
                    } else {
                        pearl = 0; // Black pearl picked from bowl 1
                    }
                } else {
                    int randomNum = new Random().nextInt(whiteCount2 + blackCount2);
                    if (randomNum < whiteCount2) {
                        pearl = 1; // White pearl picked from bowl 2
                    } else {
                        pearl = 0; // Black pearl picked from bowl 2
                    }
                }
                // Increment survival count if a white pearl is picked
                if (pearl == 1) {
                    survivalCount++;
                }
            }

            totalSurvivals += survivalCount;
            // Print the number of survivals for each case
            System.out.printf("Case %s: %d survivals\n", c, survivalCount);
        }

        // Print the total number of survivals across all cases
        System.out.printf("Total survivals: %d\n", totalSurvivals);
    }
}
