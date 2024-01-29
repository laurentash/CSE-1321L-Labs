//..Class: CSE 1321L
//Section: Wj1
//Term: Spring 2024
//Instructor: Deekshitha Atti.
//Name: Lauren Shockley
// Assignment 2 A


import java.util.Scanner;
public class Assignment2A {

    public static void main (String[] args) {


        Scanner scan = new Scanner (System.in);

        int firstnum;
        int secondnum;

        System.out.println("Enter a number you want to find a multiple of: ");
        firstnum = scan.nextInt();

        System.out.println("Enter a second number: ");
        secondnum = scan.nextInt();

        System.out.println("Calculating...");

        int finale = secondnum - (secondnum % firstnum);

        System.out.println("The nearest multiple of " + firstnum + " from " + secondnum + " is " + finale + "!");






    }


}
