import java.util.Scanner;

public class Lab8A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Please enter 5 integers for the first array:");
        for (int i = 0;
             i < 5;
             i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Please enter 5 integers for the second array:");
        for (int i = 0;
             i < 5;
             i++) {

            System.out.print("Integer " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] sumArray = new int[5];
        for (int i = 0;
             i < 5;
             i++) {

            sumArray[i] = array1[i] + array2[i];
        }

        System.out.print("The resulting sums are ");
        for (int i = 0;
             i < 5;
             i++) {

            System.out.print(sumArray[i]);
            if (i != 4) {

                System.out.print("|");
            }
        }
    }
}
