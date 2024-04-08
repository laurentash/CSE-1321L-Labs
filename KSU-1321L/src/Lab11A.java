import java.util.Scanner;

public class Lab11A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"Hello World", "Goodbye Moon", "Walking on Sunshine"};

        do {
            displayMenu(menu);
            int choice = getUserChoice(scanner, menu.length);
            performAction(choice);
        } while (shouldRerun(scanner));

        System.out.println("Program Ends");
    }

    public static void displayMenu(String[] menu) {
        System.out.println("Menu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ") " + menu[i]);
        }
    }

    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice;
        do {
            System.out.print("What would you like to do: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 0 || choice >= maxChoice);
        return choice;
    }

    public static void performAction(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Hello!");
                break;
            case 1:
                System.out.println("Ok, bye.");
                break;
            case 2:
                System.out.println("WHOA!");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        System.out.print("Type YES to rerun: ");
    }

    public static boolean shouldRerun(Scanner scanner) {
        System.out.print("Type YES to rerun: ");
        String input = scanner.next();
        return input.equalsIgnoreCase("YES");
    }
}
