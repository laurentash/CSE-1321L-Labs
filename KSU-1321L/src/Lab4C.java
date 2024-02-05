import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float temp;
        float choice;

        System.out.println("Welcome!");
        System.out.println("Please input a number: ");
        temp = scan.nextInt();

        System.out.println("What would you like to do to this number:\n" +
                "0) Get the additive inverse of the number\n" +
                "1) Get the reciprocal of the number\n" +
                "2) Square the number\n" +
                "3) Cube the number\n" +
                "4) Exit the program");
        choice = scan.nextFloat();


        switch((int) choice) {

            case 0:
                System.out.println("The additive inverse of "+temp+" is -" + temp);
                break;
            case 1:
                System.out.println("The reciprocal of "+temp+" is "+ 1/temp);
                break;

            case 2:
                System.out.println("The square of "+temp+" is "+temp*temp);
                break;
            case 3:
                System.out.println("The cube of "+temp+" is "+temp*temp*temp);
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
                break;
            default:
                System.out.println("Invalid input, please try again!");
                break;
        }





    }


}