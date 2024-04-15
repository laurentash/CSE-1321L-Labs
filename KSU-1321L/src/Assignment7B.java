import java.util.Scanner;

public class Assignment7B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("[Portable Pix Map Art Program]");
        System.out.print("Enter an image width: ");
        int width = scanner.nextInt();

        System.out.print("Enter an image height: ");
        int height = scanner.nextInt();

        Pixel[][] pixels = new Pixel[height][width];

        System.out.print("Enter the fill color’s red value: ");
        int red = scanner.nextInt();

        System.out.print("Enter the fill color’s green value: ");
        int green = scanner.nextInt();

        System.out.print("Enter the fill color’s blue value: ");
        int blue = scanner.nextInt();


        for (int i = 0;
             i < height;
             i++) {

            for (int j = 0;
                 j < width;
                 j++) {

                pixels[i][j] = new Pixel(red, green, blue);

            }
        }

        while (true) {

            System.out.println("What will you do?");
            System.out.println("1) Fill in a pixel");
            System.out.println("2) Fill in a line");
            System.out.println("3) Print the image");
            System.out.println("4) Quit");
            System.out.print("Choice? ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Row: ");
                    int row = scanner.nextInt();

                    System.out.print("Column: ");
                    int col = scanner.nextInt();

                    System.out.print("New Red Color: ");
                    red = scanner.nextInt();

                    System.out.print("New Green Color: ");
                    green = scanner.nextInt();

                    System.out.print("New Blue Color: ");
                    blue = scanner.nextInt();

                    pixels[row][col].changeRGB(red, green, blue);

                    break;
                case 2:

                    System.out.print("Row: ");
                    int startRow = scanner.nextInt();

                    System.out.print("Column: ");
                    int startCol = scanner.nextInt();

                    System.out.print("Length: ");
                    int length = scanner.nextInt();

                    System.out.print("New Red Color: ");
                    red = scanner.nextInt();

                    System.out.print("New Green Color: ");
                    green = scanner.nextInt();

                    System.out.print("New Blue Color: ");
                    blue = scanner.nextInt();

                    for (int i = 0;
                         i < length && startCol + i < width;
                         i++) {

                        pixels[startRow][startCol + i].changeRGB(red, green, blue);

                    }
                    break;

                case 3:

                    System.out.println("P3");
                    System.out.println(width + " " + height);

                    System.out.println("255");

                    for (Pixel[] rowPixels : pixels) {

                        for (Pixel pixel : rowPixels) {

                            pixel.printRGB();
                        }
                    }
                    break;

                case 4:

                    System.out.println("P3");
                    System.out.println(width + " " + height);
                    System.out.println("255");

                    for (Pixel[] rowPixels : pixels) {

                        for (Pixel pixel : rowPixels) {

                            pixel.printRGB();

                        }
                    }
                    System.out.println("Closing...");

                    return;

                default:

                    System.out.println("Invalid choice");
            }
        }
    }
}
