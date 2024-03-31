import java.util.Scanner;

public class Lab10A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        int min = min(num1, num2);
        int max = max(num1, num2);

        double average = average(num1, num2);

        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
        System.out.println("Average is " + average);

    }

    public static int max(int x,
                          int y) {

        return Math.max(x, y);
    }

    public static int min(int x,
                          int y) {

        return Math.min(x, y);
    }

    public static double average(int x,
                                 int y) {

        return (double) (x + y) / 2;
    }
}
