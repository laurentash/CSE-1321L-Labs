import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largestNumber = 0;
        int number;

        System.out.println("Please enter 10 numbers and this program will display the largest.");

        for (int i = 1;
             i <= 10;
             i++)
        {

            System.out.print("Please enter number " + i + ": ");
            number = scanner.nextInt();

            if (number > largestNumber) {
                largestNumber = number;

            }
        }

        System.out.println("The largest number was " + largestNumber);


    }
}
