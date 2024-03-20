import java.util.Random;
import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many games do you want to play?: ");
        int numGames = scanner.nextInt();

        String[] options = {"Rock", "Paper", "Scissors"};

        int[] playerWins = new int[numGames];
        int[] computerWins = new int[numGames];

        for (int i = 0; i < numGames; i++) {

            System.out.println("Round " + (i + 1) + ":");

            System.out.print("What do you want to throw? (Rock/Paper/Scissors): ");

            String playerChoice = scanner.next();
            String computerChoice = options[random.nextInt(3)];

            System.out.println("Computer threw " + computerChoice + "!");


            if (playerChoice.equalsIgnoreCase(computerChoice)) {

                System.out.println("Round " + (i + 1) + " resulted in a tie!");

            } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                    (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper")) ||
                    (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))) {

                System.out.println("Player won Round " + (i + 1) + " with " + playerChoice + "!");
                playerWins[i] = 1;

            } else {

                System.out.println("Computer won Round " + (i + 1) + " with " + computerChoice + "!");
                computerWins[i] = 1;
            }
        }

        System.out.println("Game Over...");
        System.out.println("Here’s the recap:");

        for (int i = 0; i < numGames; i++) {

            if (playerWins[i] == 1) {

                System.out.println("Player won Round " + (i + 1) + " with " + options[i]);

            } else if (computerWins[i] == 1) {

                System.out.println("Computer won Round " + (i + 1) + " with " + options[i]);

            } else {

                System.out.println("Round " + (i + 1) + " resulted in a tie!");
            }
        }
    }
}
