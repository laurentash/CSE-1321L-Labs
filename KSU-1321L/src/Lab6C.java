import java.util.Scanner;

public class Lab6C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int selection;
        int deposit;
        int balance = 1000;
        int withdrawl;
        String menuChoice;


        System.out.println("Welcome!");
        System.out.println("You have $1000 in your account.");

        do {
            System.out.println("""
                    Menu
                    0) Make a deposit
                    1) Make a withdrawal
                    2) Display account value
                    Please make a selection:\s""");
            selection = scanner.nextInt();

            switch (selection) {
                case 0:

                    System.out.print("How much would you like to deposit? : ");
                    deposit = scanner.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your current balance is $" + balance);
                    break;

                case 1:

                    System.out.print("How much would you like to withdraw? : ");
                    withdrawl = scanner.nextInt();

                    if (withdrawl > balance) {
                        System.out.println("Insufficient funds. Your current balance is $" + balance);
                    }
                    else {
                        balance = balance - withdrawl;
                        System.out.println("Your current balance is $" + balance);
                    }
                    break;

                case 2:

                    System.out.println("Your current balance is $" + balance);
                    break;

                default:

                    System.out.println("Invalid entry, please try again.");
                    break;
            }

            System.out.print("Would you like to return to the main menu (Y/N)? : ");

            menuChoice = scanner.next();
        } while (menuChoice.equalsIgnoreCase("Y"));

        System.out.println("Thank you for banking with us!");

    }
}
