import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[FYE Level Map Creator]");
        System.out.print("Enter a level map width: ");
        int width = scanner.nextInt();

        System.out.print("Enter a level map height: ");
        int height = scanner.nextInt();

        char[][] levelMap = new char[height][width];
        initializeLevelMap(levelMap);

        while (true) {
            printLevelMap(levelMap);
            displayMenu();

            System.out.print("Enter a choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    clearLevel(levelMap);
                    break;
                case 2:
                    addPlatform(levelMap, scanner);
                    break;
                case 3:
                    addItem(levelMap, scanner);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");

            }
        }
    }

    private static void initializeLevelMap(char[][] levelMap) {
        for (int i = 0;
             i < levelMap.length;
             i++) {

            for (int j = 0;
                 j < levelMap[i].length;
                 j++) {

                levelMap[i][j] = '_';
            }
        }
    }

    private static void printLevelMap(char[][] levelMap) {
        for (char[] row : levelMap) {

            for (char cell : row) {

                System.out.print(cell);
            }

            System.out.println();
        }
    }

    private static void displayMenu() {

        System.out.println("Options");
        System.out.println("1. Clear Level");
        System.out.println("2. Add Platform");
        System.out.println("3. Add Item");
        System.out.println("4. Quit");

    }

    private static void clearLevel(char[][] levelMap) {

        initializeLevelMap(levelMap);
        System.out.println("[Clear Level]");
    }

    private static void addPlatform(char[][] levelMap, Scanner scanner) {
        System.out.println("[Add Platform]");
        System.out.print("Enter X Coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y Coordinate: ");
        int y = scanner.nextInt();

        System.out.print("Enter Length: ");
        int length = scanner.nextInt();

        if (x + length > levelMap[0].length) {

            System.out.println("This platform won’t fit in the level!");
            return;
        }

        for (int i = x;
             i < x + length;
             i++) {

            levelMap[y][i] = '=';
        }
    }

    private static void addItem(char[][] levelMap, Scanner scanner) {
        System.out.println("[Add Item]");
        System.out.print("Enter X Coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y Coordinate: ");
        int y = scanner.nextInt();

        if (x >= levelMap[0].length || y >= levelMap.length) {

            System.out.println("This is not a valid location!");
            return;
        }

        levelMap[y][x] = 'P';
    }
}
