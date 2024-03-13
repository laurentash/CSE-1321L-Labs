import java.util.Scanner;

public class Lab8B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Please enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.println("I have " + rows + " rows and " + columns + " columns. I need to fill-up " + (rows * columns) + " spaces.");

        int[][] array = new int[rows][columns];
        int count = 1;

        for (int i = 0;
             i < rows;
             i++) {

            for (int j = 0;
                 j < columns;
                 j++) {
                array[i][j] = count++;

            }
        }

        System.out.println("The " + rows + "x" + columns + " array:");
        for (int i = 0; i < rows; i++) {

            for (int j = 0;
                 j < columns;
                 j++) {

                System.out.print(array[i][j]);

                if (j < columns - 1) {

                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
