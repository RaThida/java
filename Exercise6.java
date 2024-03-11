// we import random to generate rondom number of the game
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        int totalOfGames = 100;
        int personAWin = 0;
        int personBWin = 0;

        // simulate game for person A and increment personAWin if person A win the game
        for (int i = 0; i < totalOfGames; i++) {
            personAWin += playGame();
        }
        
        // simulate game for person B and increment personBWin if person B win the game
        for (int i = 0; i < totalOfGames; i++) {
            personBWin += playGame();
        }
        //display the reusult
        System.out.println("The total of the games: " + totalOfGames);
        System.out.println("Person A wins " + personAWin + " out of " + totalOfGames + " games");
        System.out.println("Person B wins " + personBWin + " out of " + totalOfGames + " games");
    }

    public static int playGame() {
        Random random = new Random();
        // simulate person A and person B picking numbers 1, 2, or 3
        int personA_choice = random.nextInt(3) + 1;
        int personB_choice = random.nextInt(3) + 1;
        // check if they match
        if (personA_choice == personB_choice) {
            // person A wins
            return 1;
        } else {
            // person B wins
            return 0;
        }
        
    }
}

