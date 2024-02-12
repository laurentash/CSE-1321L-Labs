import java.util.Scanner;

import java.util.Scanner;

public class Lab5B {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int integer;
        int mod1;
        int mod2;
        int mod3;

        System.out.println("Enter an integer: ");
        integer = scan.nextInt();

        mod1 = integer % 2;
        mod2 = integer % 5;
        mod3 = integer % 3;
        if (mod1 == 0) {
            System.out.println("This number is divisible by 2");
        }
        else if (mod3 == 0) {
            System.out.println("This number is divisible by 3");
        }
        else if (mod2 == 0) {
            System.out.println("This number is divisible by 5");
        }
        else if (mod2 != 0) {
            System.out.println("This number is undetermined");
        }

    }


}