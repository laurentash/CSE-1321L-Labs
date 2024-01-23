import java.util.Scanner;

public class Assignment1B {

    public static void main (String[] args) {

        float Red1;
        float Green1;
        float Blue1;

        float Red2;
        float Green2;
        float Blue2;

        Scanner scan = new Scanner(System.in);



        System.out.print("First value of color R: ");
        Red1 = scan.nextFloat();

        System.out.print("First value of color G: ");
        Green1 = scan.nextFloat();

        System.out.print("First value of color B: ");
        Blue1 = scan.nextFloat();



        System.out.print("Second value of color R: ");
        Red2 = scan.nextFloat();

        System.out.print("Second value of color G: ");
        Green2 = scan.nextFloat();

        System.out.print("Second value of color B: ");
        Blue2 = scan.nextFloat();


        float Red3 = Red2 - Red1;
        float Red4 = Red3 * Red3;

        float Green3 = Green2 - Green1;
        float Green4 = Green3 * Green3;

        float Blue3 = Blue2 - Blue1;
        float Blue4 = Blue3 * Blue3;

        float distance = (float) Math.sqrt( Red4 + Green4 + Blue4 );

        System.out.println("First Color: ");
        System.out.println("R:" + Red1);
        System.out.println("G:" + Green1);
        System.out.println("B:" + Blue1);

        System.out.println("Second Color: ");
        System.out.println("R:" + Red2);
        System.out.println("G:" + Green2);
        System.out.println("B:" + Blue2);


        System.out.print("Color distance: " + distance);



    }


}

