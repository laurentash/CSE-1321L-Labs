import java.util.Scanner;

public class Assignment4A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char character;
        int width;
        int num;
        int it;
        int num2;


        System.out.print("Enter a character to use: ");
        character = scanner.nextLine().charAt(0);

        System.out.print("Enter the diamond's width: ");
        width = scanner.nextInt();

        if (width % 2 == 0) {

            width++;
            System.out.println("To make a diamond, we’ll use " + width + " as the width instead.");

        }


        int halfWidth = width / 2;

        for (num = 0;
             num < width;
             num++) {
            for (it = 0;
                 it < Math.abs(halfWidth - num);
                 it++) {

                System.out.print(" ");
            }
            for (num2 = 0;
                 num2 < width - 2 * Math.abs(halfWidth - num);
                 num2++) {

                System.out.print(character);
            }

            System.out.println();
        }



    }
}
