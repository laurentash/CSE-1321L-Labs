//..Class: CSE 1321L
//Section: Wj1
//Term: Spring 2024
//Instructor: Deekshitha Atti.
//Name: Lauren Shockley
//Lab#: Lab 3 C

import java.util.Scanner;
public class Lab3C {
    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);


        int quarters;
        int dimes;
        int nickles;
        int pennies;

        System.out.println("Enter the number of quarters: ");
        quarters = scan.nextInt();

        System.out.println("Enter the number of dimes: ");
        dimes = scan.nextInt();

        System.out.println("Enter the number of nickels: ");
        nickles = scan.nextInt();

        System.out.println("Enter the number of pennies: ");
        pennies = scan.nextInt();

        int cointotal = quarters * 25 + dimes * 10 + nickles * 5 + pennies;
        int dollarcount = cointotal / 100;
        int remainCents = cointotal % 100;

        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickles + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");
        System.out.println("Your total is " + dollarcount + " dollars and " + remainCents + " cents.");





    }

}
