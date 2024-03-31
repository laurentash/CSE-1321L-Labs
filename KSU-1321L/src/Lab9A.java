import java.util.Scanner;

public class Lab9A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] numbers = new int[10];
        int targetnum;


        System.out.println("Please enter 10 numbers:");
        for (int i = 0;
             i < 10;
             i++) {

            System.out.print("Integer " + (i + 1) + ": ");

            numbers[i] = input.nextInt();

        }


        System.out.print("What is the target number: ");
        targetnum = input.nextInt();


        boolean found = false;

        for (int i = 0;
             i < numbers.length;
             i++) {
            if (numbers[i] == targetnum) {

                found = true;
                break;

            }
        }


        if (found) {

            System.out.println("The target is in the set.");

        } else {

            System.out.println("The target is not in the set.");
        }


    }
}