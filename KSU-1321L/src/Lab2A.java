//..Class: CSE 1321L
//Section: Wj1
//Term: Spring 2024
//Instructor: Deekshitha Atti.
//Name: Lauren Shockley
//Lab#: Lab 2 A

import java.util.Scanner;
public class Lab2A {

    public static void main (String[] args) {

//        String textInBold =  "\033[0;1m" + "Java_Prof_Level";
//        System.out.print(textInBold);
        String name1;
        String name2;
        String verb;
        String adverb;



        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a name: ");
        name1 = scan.next();

        System.out.print("Enter another name: ");
        name2 = scan.next();

        System.out.print("Enter a verb: ");
        verb = scan.next();

        System.out.print("Enter an adverb: ");
        adverb = scan.next();


        System.out.print("Once upon a time, there was a person named "+ name1 +" who had a child named\n" +
                name2+" who would "+ verb + " " + adverb + " while singing to strangers. ");

    }
}
