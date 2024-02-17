import java.util.Scanner;
import java.util.Random;

public class Lab6B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int input;
        int guessnum = 0;
        int guess;

        System.out.println("Enter a number between 1 and 1000: ");
        input = scanner.nextInt();

        while (input < 1 || input > 1000) {

            System.out.println("Enter a number between 1 and 1000: ");
            input = scanner.nextInt();
        }

        do {
            guess = rand.nextInt(1000) + 1;
            System.out.println("My guess was " + guess);
            guessnum++;

        }
        while (guess != input);

        System.out.println("I guessed the number was " + input + " and it only took me " + guessnum + " guesses.");
    }
}
