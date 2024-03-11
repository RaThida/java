import java.util.Random;

public class Exercise9 {

    public static void main(String[] args) {
        simulateGame();
    }

    static void simulateGame() {
        int[] players = {1, 2, 3, 4, 5, 6};
        int[] shots = new int[players.length];

        for (int round = 0; round < 1000; round++) {
            shuffleArray(players); // Shuffle player order for each round
            int[] barrel = {0, 0, 0, 0, 0, 1};

            for (int turn = 1; turn <= 6; turn++) {
                shuffleArray(barrel); // Randomly rotate the barrel before each shot
                int shot = barrel[barrel.length - 1];

                if (shot == 1) {
                    int player = players[turn - 1];
                    shots[player - 1]++;
                    break; // Player got shot, end the round
                }
            }
        }

        // Display the results
        System.out.println("Number of times each player got shot:");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + shots[i] + " times");
        }
    }

    static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swap array[i] and array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}