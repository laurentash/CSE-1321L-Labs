import java.util.Scanner;
public class Assignment2B {

    public static void main (String[] args) {


        Scanner scan = new Scanner (System.in);

        int botleftX;
        int botleftY;
        int width;
        int height;

        System.out.println("Enter the hit box bottom-left X coordinate: ");
        botleftX = scan.nextInt();

        System.out.println("Enter the hit box bottom-left Y coordinate: ");
        botleftY = scan.nextInt();

        System.out.println("Enter the width of the hit box: ");
        width = scan.nextInt();

        System.out.println("Enter the height of the hit box: ");
        height = scan.nextInt();


        System.out.println("[Hit Box Coordinates]");

        System.out.println("Bottom-Left: " + botleftX +", " + botleftY);

        System.out.println("Top-Left: " + botleftX +", " + (botleftY+height));

        System.out.println("Bottom-Right: " + (botleftX + width) +", " + botleftY);

        System.out.println("Top-right: " + (botleftX + width) +", " + (botleftY+height));












    }




}
