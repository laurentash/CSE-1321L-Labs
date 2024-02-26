import java.util.Scanner;
import java.util.Random;

public class Assignment4B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int mode;
        int num1;
        int num2;
        int answer;
        int it;
        int tries;
        String gamemode;
        int correctans = 0;

        System.out.println("[Mathletes Game]");
        System.out.print("Choose a game mode (0=Easy, 1=Hard): ");
        mode = scanner.nextInt();

        gamemode = (mode == 0) ? "Easy" : "Hard";
        System.out.println("Playing on " + gamemode + " mode, huh? Okay!");


        int numquestions = (mode == 0) ? 3 : 6;
        int maxtries = (mode == 0) ? 3 : 1;


        for (it = 1;
             it <= numquestions;
             it++) {

            num1 = random.nextInt(511) - 255;
            num2 = random.nextInt(511) - 255;
            correctans = num1 * num2;

            System.out.print("Q" + it + ". " + num1 + " * " + num2 + " = ? ");
            answer = scanner.nextInt();

            if (answer == correctans) {

                System.out.println("Correct!");
                correctans++;

            } else {

                System.out.println("Incorrect! Try again.");

                for (tries = 1;
                     tries <= maxtries;
                     tries++) {
                    answer = scanner.nextInt();

                    if (answer == correctans) {

                        System.out.println("Correct!");
                        correctans++;
                        break;

                    } else {

                        System.out.println("Incorrect! Try again.");
                    }
                }
            }
        }

        if (correctans == numquestions) {

            System.out.println("You win!");

        } else {

            System.out.println("Game over...");

        }




    }
}
