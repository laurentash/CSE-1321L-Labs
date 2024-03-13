import java.util.Scanner;

public class Lab8C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Please enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Please enter the number of columns: ");
        columns = scanner.nextInt();

        int[][] array2D = new int[rows][columns];

        System.out.println("I have " + rows + " rows and " + columns + " columns. I need to fill-up " + (rows * columns) + " spaces.");

        System.out.println("The " + rows + "x" + columns + " array:");
        fillArray(array2D);

        System.out.println("The " + rows + "x" + columns + " 2-D array flattened into a " + (rows * columns) + " cell 1-D array:");
        flattenArray(array2D);
    }

    public static void fillArray(int[][] array) {

        int count = 1;

        for (int i = 0;
             i < array.length;
             i++) {

            for (int j = 0;
                 j < array[i].length;
                 j++) {

                array[i][j] = count++;
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void flattenArray(int[][] array) {

        for (int i = 0;
             i < array.length;
             i++) {

            for (int j = 0;
                 j < array[i].length;
                 j++) {

                System.out.print(array[i][j] + "|");
            }
        }
        System.out.println();
    }
}
