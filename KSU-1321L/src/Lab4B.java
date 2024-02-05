import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String day;

        System.out.println("Enter the day: ");
        day = scan.next();

        switch(day) {

            case "monday", "Monday", "wednesday", "Wednesday":
                System.out.println("I have class today!");
                break;

            case "friday", "Friday":
                System.out.println("  It's Friday! Friday! Gotta get down on Friday!");
                break;

            default:
                System.out.println("I should use this time to do my homework.");
                break;

        }




    }


}