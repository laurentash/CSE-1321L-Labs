import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size;
        int num;
        int it;

        System.out.print("Please enter a value for the size: ");
        size = scanner.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");

        for (it = 1;
             it <= size;
             it++) {

            for (num = 1;
                 num <= it;
                 num++) {

                System.out.print("*");

            }

            System.out.println();
        }
    }
}
