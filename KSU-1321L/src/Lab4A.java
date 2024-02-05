import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double grade;

        System.out.println("Enter the score of your exam: ");
        grade = scan.nextDouble();

        if (grade >= 98) {
            System.out.println("Letter grade is: A+");
        }
        else if (grade >= 95) {
            System.out.println("Letter grade is: A");
        }
        else if (grade >= 92) {
        System.out.println("Letter grade is: A-");
        }
        else if (grade >= 89) {
            System.out.println("Letter grade is: B+");
        }
        else if (grade >= 86) {
            System.out.println("Letter grade is: B");
        }
        else if (grade >= 83) {
            System.out.println("Letter grade is: B-");
        }
        else if (grade >= 80) {
            System.out.println("Letter grade is: C+");
        }
        else if (grade >= 77) {
            System.out.println("Letter grade is: C");
        }
        else if (grade >= 74) {
            System.out.println("Letter grade is: C-");
        }
        else if (grade >= 71) {
            System.out.println("Letter grade is: D+");
        }
        else if (grade >= 68) {
            System.out.println("Letter grade is: D");
        }
        else if (grade >= 65) {
            System.out.println("Letter grade is: D-");
        }
        else if (grade <= 64) {
            System.out.println("Letter grade is: F");
        }





    }
}