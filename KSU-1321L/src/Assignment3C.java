import java.util.Scanner;

public class Assignment3C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice3;
        int choice2;
        int choice;

        System.out.println("[Epic Quest Simulator]");
        System.out.println("Hello stranger! Do you have time to hear my tale?\n(1) Yes\n(2) No");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!");
            System.out.println("(1) That's awful!\n(2) What can I do?");
            choice2 = input.nextInt();

            if (choice2 == 1) {

                System.out.println("Alas, it is truly terrible...");
            }

            System.out.println("Please, you must journey to Pax Bisonica and free our country!");
            System.out.println("(1) Okay\n(2) No");
            choice3 = input.nextInt();


            if (choice3 == 1) {
                System.out.println("Hooray!");
            }
            else {
                System.out.println("Then all is lost...");
            }

        }
        else {
            System.out.println("Ah, then goodbye...");
        }


    }

}





