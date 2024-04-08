import java.util.Scanner;

public class Lab11B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {

            System.out.println("Valid password");

        } else {

            System.out.println("Invalid password");
        }

        System.out.println("Program Ends");
    }

    public static boolean isValidPassword(String password) {

        boolean hasLength = password.length() >= 8;
        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {

                hasUpperCase = true;

            } else if (Character.isDigit(ch)) {

                hasDigit = true;
            }
        }

        return hasLength && hasUpperCase && hasDigit;
    }
}
