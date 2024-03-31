import java.util.Scanner;

public class Lab10B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        char choice;

        do {
            System.out.print("Enter width: ");

            double width = scanner.nextDouble();

            System.out.print("Enter height: ");
            double height = scanner.nextDouble();

            if (isValid(width, height)) {

                System.out.println("This is a valid rectangle");

                System.out.println("The area is: " + area(width, height));
                System.out.println("The perimeter is: " + perimeter(width, height));

            } else {

                System.out.println("This is an invalid rectangle");
            }

            System.out.print("Do you want to enter another width and height (Y/N)? : ");

            choice = scanner.next().charAt(0);


        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program Ends");
    }

    public static boolean isValid(double width, double height) {

        return width + height > 30;

    }

    public static double area(double width, double height) {

        return width * height;

    }

    public static double perimeter(double width, double height) {

        return 2 * (width + height);

    }
}
