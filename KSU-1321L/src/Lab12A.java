import java.util.Scanner;


class Chair {
    public int numOfLegs;
    public boolean rolling;
    public String material;


    public Chair(int legs, boolean isRolling, String materialType) {

        numOfLegs = legs;
        rolling = isRolling;
        material = materialType;

    }
}


public class Lab12A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("You are about to create a chair.");

        System.out.print("How many legs does your chair have: ");
        int legs = scanner.nextInt();

        System.out.print("Is your chair rolling (true/false): ");
        boolean isRolling = scanner.nextBoolean();

        System.out.print("What is your chair made of: ");
        String materialtype = scanner.next();


        Chair myChair = new Chair(legs, isRolling, materialtype);


        System.out.println("Your chair has " + myChair.numOfLegs + " legs, is " +
                (myChair.rolling ? "rolling" : "not rolling") +
                ", and is made of " + myChair.material + ".");


        myChair.numOfLegs = 4;
        myChair.rolling = false;
        myChair.material = "wood";


        System.out.println("This program is going to change that.");

        System.out.println("Your chair has " + myChair.numOfLegs + " legs, is " +
                (myChair.rolling ? "rolling" : "not rolling") +
                ", and is made of " + myChair.material + ".");
    }
}
