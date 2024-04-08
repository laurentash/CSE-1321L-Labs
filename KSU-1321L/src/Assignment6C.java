import java.util.Random;
import java.util.Scanner;

public class Assignment6C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("[Minesweeper – DOS Edition]");
        System.out.print("What is the grid size? ");
        int gridSize = scanner.nextInt();

        char[][] grid = new char[gridSize][gridSize];
        int[] mineLocations = new int[gridSize];


        for (int i = 0;
             i < gridSize;
             i++) {

            for (int j = 0;
                 j < gridSize;
                 j++) {

                grid[i][j] = '?';
            }
        }


        for (int i = 0;
             i < gridSize;
             i++) {

            mineLocations[i] = random.nextInt(gridSize);
        }

        int x, y;
        boolean hitMine = false;

        do {

            printGrid(grid);

            System.out.print("Enter your X coordinate: ");
            x = scanner.nextInt();

            System.out.print("Enter your Y coordinate: ");
            y = scanner.nextInt();

            if (mineLocations[x] == y) {

                grid[x][y] = 'X';
                hitMine = true;
                System.out.println("Sorry, you hit a mine!");

            } else {

                grid[x][y] = '_';
                hitMine = false;
            }

        } while (!hitMine && countFreeSpaces(grid) != 0);

        if (!hitMine) {

            System.out.println("You win!");
        }
    }

    public static void printGrid(char[][] grid) {

        for (char[] row : grid) {

            for (char cell : row) {

                System.out.print(cell);
            }

            System.out.println();
        }
    }

    public static int countFreeSpaces(char[][] grid) {

        int count = 0;

        for (char[] row : grid) {

            for (char cell : row) {

                if (cell == '_') {

                    count++;
                }
            }
        }

        return count;
    }
}
