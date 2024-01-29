//..Class: CSE 1321L
//Section: Wj1
//Term: Spring 2024
//Instructor: Deekshitha Atti.
//Name: Lauren Shockley
//Lab#: Lab 3 A

import java.util.Scanner;

public class Lab3A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double OwedAmount;
        double APR;

        System.out.print("Amount owed: $");
        OwedAmount = scan.nextDouble();

        System.out.print("APR: ");
        APR = scan.nextDouble();
        double decAPR = APR / 100;

        double MinPayment = (OwedAmount * decAPR) / 12;
        double MPR = APR / 12;

        System.out.printf("Monthly percentage rate: %.3f \n", MPR);
        System.out.printf("Minimum payment: $%.2f", MinPayment);


    }


}