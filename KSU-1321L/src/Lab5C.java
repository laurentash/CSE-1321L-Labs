import java.util.Scanner;



public class Lab5C {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double xvalue;
        Double yvalue;
        System.out.print("Enter x: ");
        xvalue = scan.nextDouble();
        System.out.print("Enter y: ");
        yvalue = scan.nextDouble();

        if (xvalue == 0 && yvalue == 0) {
            System.out.println("This point is the origin.");

        }
        else if (xvalue == 0 && yvalue > 0) {
            System.out.println("This point is on the y axis.");

        }
        else if (xvalue > 0 && yvalue == 0) {
            System.out.print("This point is on the x axis.");

        }
        else if (xvalue > 0 && yvalue > 0) {
            System.out.println("This point is in the first quadrant.");

        }
        else if (xvalue < 0 && yvalue > 0) {
            System.out.println("This point is in the second quadrant.");

        }
        else if (xvalue < 0 && yvalue < 0) {
            System.out.println("This point is in the third quadrant.");

        }
        else if (xvalue > 0 && yvalue < 0) {
            System.out.println("This point is in the fourth quadrant.");

        }





    }

}