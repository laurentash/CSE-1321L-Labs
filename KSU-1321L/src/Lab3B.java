//..Class: CSE 1321L
//Section: Wj1
//Term: Spring 2024
//Instructor: Deekshitha Atti.
//Name: Lauren Shockley
//Lab#: Lab 3 B

import java.util.Scanner;
public class Lab3B {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        float course1Hrs;
        float course1Grd;

        float course2Hrs;
        float course2Grd;

        float course3Hrs;
        float course3Grd;

        float course4Hrs;
        float course4Grd;

        System.out.println("Course 1 hours:");
        course1Hrs = scan.nextFloat();
        System.out.println("Grade for course 1: ");
        course1Grd = scan.nextFloat();

        System.out.println("Course 2 hours:");
        course2Hrs = scan.nextFloat();
        System.out.println("Grade for course 2: ");
        course2Grd = scan.nextFloat();

        System.out.println("Course 3 hours:");
        course3Hrs = scan.nextFloat();
        System.out.println("Grade for course 3: ");
        course3Grd = scan.nextFloat();

        System.out.println("Course 4 hours:");
        course4Hrs = scan.nextFloat();
        System.out.println("Grade for course 4: ");
        course4Grd = scan.nextFloat();

        float crse1t = course1Hrs * course1Grd;
        float crse2t = course2Hrs * course2Grd;
        float crse3t = course3Hrs * course3Grd;
        float crse4t = course4Hrs * course4Grd;
        float qualpoints = crse1t + crse2t + crse3t + crse4t;

        float totalcreds = course1Hrs + course2Hrs + course3Hrs +course4Hrs;

        float GPA = qualpoints / totalcreds;

        System.out.println("Total hours is: " + totalcreds);
        System.out.println("Total quality points is: " + qualpoints);
        System.out.println("Your GPA for this semester is " + GPA);
















    }

}
