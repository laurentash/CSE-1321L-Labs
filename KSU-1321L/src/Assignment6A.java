import java.util.Arrays;
import java.util.Random;

public class Assignment6A {
    public static void main(String[] args) {

        int[] array = generateRandomArray(19);
        int attempts = 0;

        System.out.println("[Bogosort]");
        System.out.println("Printing array...");

        PrintArray(array);

        while (!check_if_sorted(array)) {

            attempts++;

            System.out.println("Not sorted yet!");
            System.out.println("Shuffling array...");
            shuffleArray(array);

            System.out.println("Printing array...");
            PrintArray(array);
        }

        System.out.println("Hooray, it’s sorted! And it only took " + attempts + " attempts!");

    }

    public static boolean check_if_sorted(int[] array) {

        for (int i = 0;
             i < array.length - 1;
             i++) {

            if (array[i] > array[i + 1]) {

                return false;
            }
        }

        return true;
    }

    public static void shuffleArray(int[] array) {

        Random rnd = new Random();


        for (int i = array.length - 1;
             i > 0;
             i--) {

            int index = rnd.nextInt(i + 1);
            int temp = array[index];

            array[index] = array[i];
            array[i] = temp;

        }
    }

    public static void PrintArray(int[] array) {

        System.out.print(Arrays.toString(array));
        System.out.println();
    }


    public static int[] generateRandomArray(int size) {

        Random rnd = new Random();


        int[] array = new int[size];

        for (int i = 0;
             i < size;
             i++) {

            array[i] = rnd.nextInt(453) + 1;
        }

        return array;
    }
}
