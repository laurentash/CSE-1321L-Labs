//..Class: CSE 1321L
//Section: Wj1
//Term: Spring 2024
//Instructor: Deekshitha Atti.
//Name: Lauren Shockley
//Lab#: Lab 2 B
// NOTE: I was very confused regarding this lab and i used a lot of W3Schools and outside learning, just to be transparent.

public class Lab2B {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {


            for (int j = 0; j < 3 - i; j++)
                System.out.print("_");
            for (int j = 0; j < 1 + i; j++) {

                System.out.print("*");
                if (j != i)
                    System.out.print("_");

            }

            for (int j = 0; j < 3 - i; j++)
                System.out.print("_");
            System.out.println("");

        }


        for (int i = 2; i >= 0; i--) {

            for (int j = 0; j < 3 - i; j++)
                System.out.print("_");
            for (int j = 0; j < 1 + i; j++) {

                System.out.print("*");
                if (j != i)
                    System.out.print("_");

            }
            for (int j = 0; j < 3 - i; j++)

                System.out.print("_");

            System.out.println("");
        }
    }
}
