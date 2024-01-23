import java.util.Scanner;
public class Assignment1C {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        float soup;
        float rice;
        float veg;
        float PB;

        System.out.print("How many donated soups?");
        soup = scan.nextFloat();

        System.out.print("How many donated rice?");
        rice = scan.nextFloat();

        System.out.print("How many donated vegetables?");
        veg = scan.nextFloat();

        System.out.print("How many donated peanut butters?");
        PB = scan.nextFloat();

        float st = soup * 2;
        float rt = rice * 4;
        float vt = (float) (veg * 3.5);
        float pt = PB * 7;

        float tot = st + rt + vt + pt;

        System.out.println("How far your donation goes:");
        System.out.println("How many donated soups? " + soup);
        System.out.println("How many donated rice? " + rice);
        System.out.println("How many donated vegetables? " + veg);
        System.out.println("How many donated peanut butters? " + PB);
        System.out.println("Your donation will feed " + tot + " people!");

        System.out.println(st + " people with " + soup + " cans of soup");
        System.out.println(rt + " people with " + rice + " bags of rice");
        System.out.println(vt + " people with " + veg + " cans of vegetables");
        System.out.println(pt + " people with " + PB + " jars of peanut butter");











    }







}
