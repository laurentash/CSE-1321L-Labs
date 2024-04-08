import java.util.Arrays;
import java.util.Scanner;

public class Assignment6B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("[Overloaded Sort]");
        System.out.print("What data type do you want to enter? (int/char/float): ");
        String dataType = scanner.nextLine();

        if (dataType.equals("int")) {

            int[] intArray = new int[8];

            for (int i = 0;
                 i < 8;
                 i++) {

                System.out.print("Value " + (i + 1) + ": ");
                intArray[i] = scanner.nextInt();

            }

            arraySort(intArray);

        } else if (dataType.equals("char")) {

            char[] charArray = new char[8];
            for (int i = 0;
                 i < 8;
                 i++) {

                System.out.print("Value " + (i + 1) + ": ");
                charArray[i] = scanner.next().charAt(0);
            }

            arraySort(charArray);

        } else if (dataType.equals("float")) {

            float[] floatArray = new float[8];
            for (int i = 0;
                 i < 8;
                 i++) {

                System.out.print("Value " + (i + 1) + ": ");

                floatArray[i] = scanner.nextFloat();
            }

            arraySort(floatArray);

        } else {

            System.out.println("Invalid data type entered.");

            return;
        }
    }

    public static void arraySort(int[] arr) {

        Arrays.sort(arr);
        System.out.println("Calling arraySort()...");
        System.out.println("The sorted values are:");

        for (int value : arr) {

            System.out.print(value + ", ");
        }

        System.out.println();
    }

    public static void arraySort(char[] arr) {

        Arrays.sort(arr);
        System.out.println("Calling arraySort()...");
        System.out.println("The sorted values are:");

        for (char value : arr) {

            System.out.print(value + ", ");
        }
        System.out.println();
    }

    public static void arraySort(float[] arr) {

        Arrays.sort(arr);
        System.out.println("Calling arraySort()...");
        System.out.println("The sorted values are:");

        for (float value : arr) {

            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
