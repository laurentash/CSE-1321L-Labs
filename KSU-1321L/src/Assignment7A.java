import java.util.Scanner;

public class Assignment7A {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("[Finite State Automata]");

        System.out.print("What state do you want to start at? ");
        int initialState = scanner.nextInt();

        FSA fsa = new FSA(initialState);

        while (true) {

            System.out.println("What will you do?");
            System.out.println(">Go to next state");
            System.out.println(">End");

            String choice = scanner.next().toLowerCase();

            if ("go".equals(choice)) {

                int nextState = fsa.goToNextState();
                System.out.println("You’re now at state " + nextState + ".");

                if (fsa.end()) {
                    System.out.println("END");
                    break;
                }
            } else if ("end".equals(choice)) {

                if (fsa.end()) {

                    System.out.println("The FSA has shut down.");
                    break;
                }
                else {

                    System.out.println("You can’t stop here; you can only stop at state 3.");
                }
            } else
            {
                System.out.println("[Invalid command!]");
            }
        }
    }
}
