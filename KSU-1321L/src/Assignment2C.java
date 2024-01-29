import java.util.Scanner;
public class Assignment2C {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        int usdol;
        final double POUNDS_CONVERSION = .79;
        final double BISON_CONVERSION = 5.0;

        System.out.println("Welcome to Bisonica!");
        System.out.println("How many US Dollars do you have? ");
        usdol = scan.nextInt();


        double pounds = usdol * POUNDS_CONVERSION;

        double Bdols = pounds / BISON_CONVERSION;

        System.out.println(usdol + " US Dollar(s) is " + pounds + " British Pound(s),\n" +
                "      which is " + Bdols + " Bison Dollar(s)!");




    }



}
