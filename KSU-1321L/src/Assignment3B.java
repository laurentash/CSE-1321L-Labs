import java.util.Scanner;

public class Assignment3B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String encoding;

        int width;
        int height;
        int filesize;
        int BPC;

        System.out.println("[Image Encoding Checker]");

        System.out.println("What is the image width? ");
        width = input.nextInt();

        System.out.print("What is the image height? ");
        height = input.nextInt();

        System.out.print("What is the file size (in bytes)? ");
        filesize = input.nextInt();


        if (width <= 0 || height <= 0 || filesize <= 0) {

            System.out.println("The information is invalid – please re-enter it.");

        }

        BPC = (filesize * 8) / (width * height * 3);


        switch (BPC) {

            case 8:
                encoding = "8";
                break;

            case 16:
                encoding = "16";
                break;

            case 32:
                encoding = "32";
                break;

            default:
                encoding = "other";
                break;
        }

        if (encoding.equals("other")) {
            System.out.println("This is outside of expected range. The computer does not know how to read this encoding");
        }
        else {
            System.out.println("The RGBA image is encoded with " + encoding + " bits per channel.");
        }
    }
}