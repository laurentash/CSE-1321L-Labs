import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size;
        int it;
        int num;
        int num2;


        System.out.print("Please enter a value for the size: ");
        size = scanner.nextInt();

        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");
        for (it = 1;
             it <= size;
             it++) {

            for (num = 1;
                 num <= size - it;
                 num++) {
                System.out.print(" ");
            }
            for (num2 = 1;
                 num2 <= it;
                 num2++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
