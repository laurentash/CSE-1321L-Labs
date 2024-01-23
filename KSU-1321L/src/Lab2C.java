//..Class: CSE 1321L
//Section: Wj1
//Term: Spring 2024
//Instructor: Deekshitha Atti.
//Name: Lauren Shockley
//Lab#: Lab 2 C

import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float length;
        float width;

        System.out.print("Length of object? ");
        length = scan.nextFloat();

        System.out.print("Width of object? ");
        width = scan.nextFloat();

        float perim = 2 * (length + width);
        float area = width * length;

        System.out.println("Area of object: " + area);
        System.out.println("Perimeter of object: " + perim);
    }
}







