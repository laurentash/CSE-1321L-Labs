import java.util.Scanner;

public class Lab5A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer;
        String answer2;
        System.out.print("Do you have a driving permit (Y/N)? ");
        answer = scan.next();


        if (answer.equals("Y")) {
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            answer2 = scan.next();

            if (answer2.equals("Y")) {
                System.out.print("Congratulations! You can purchase a vehicle, let's start talking options!");
            }

            else if (answer2.equals("N")) {
                System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
            }

        } else if (answer.equals("N")) {
            System.out.print("Driving permit is a prerequisite to purchase a vehicle!");
        }
    }
}
