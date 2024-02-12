import java.util.Scanner;

public class Assignment3A {
    public Assignment3A() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Scrappy’s Bucket List Rewards]");
        System.out.println("How many events have you attended? ");
        int events = scan.nextInt();
        if (events == 63) {
            System.out.println("You’ve been to 100% of all SBL events!\nYou’ve earned a Drawstring Bag!\nYou’ve earned a Hat!\nYou’ve earned a T-Shirt!\nYou’ve earned a Glass Water Bottle!\nYou’ve earned a Hoodie!");
            System.out.println("Are you graduating? ");
            String graduation = scan.next();
            if (!graduation.equals("Y") && !graduation.equals("y")) {
                if (graduation.equals("N") || graduation.equals("n")) {
                    System.out.println("There’s a special reward when you graduate!");
                }
            } else {
                System.out.println("Hooray, you earned a Challenge Coin and special graduation cords!");
            }
        } else {
            int var = (int)((double)events / 63.0 * 100.0);
            System.out.println("You’ve been to " + var + "% of all SBL events!");
            if (var >= 10) {
                System.out.println("You’ve earned a Drawstring Bag!");
            }

            if (var >= 25) {
                System.out.println("You’ve earned a Hat!");
            }

            if (var >= 50) {
                System.out.println("You’ve earned a T-Shirt!");
            }

            if (var >= 75) {
                System.out.println("You’ve earned a Glass Water Bottle!");
            }
        }

    }
}
