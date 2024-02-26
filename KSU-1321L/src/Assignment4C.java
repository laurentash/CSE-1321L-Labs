import java.util.Scanner;

public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int backspacenum;
        String sentence;

        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence:");
        sentence = scanner.nextLine();

        System.out.println("How many letters do you want to backspace?");
        backspacenum = scanner.nextInt();

        System.out.print(sentence);

        for (int i = 0;
             i < backspacenum;
             i++) {

            System.out.print("\b");
            Thread.sleep(500);

        }
    }
}
