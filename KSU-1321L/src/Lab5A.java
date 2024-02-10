import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer;
        String answer2;
        System.out.println("Do you have a driving permit (Y/N)? ");
        answer = scan.next();

        if (answer == "Y"); {
            System.out.println("Do you have a commercial driving license (Y/N)? ");
            answer2 = scan.next();
            if (answer2 == "Y"); {
                System.out.println("Congratulations! You can purchase a vehicle, let’s start talking options!");
            }
            else if  (answer2 == "N"); {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        }

        switch (answer) {
            case "y", "Y":

            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");




        }

    }


}