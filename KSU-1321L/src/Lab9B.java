import java.util.Scanner;
class Lab9B {
    static int binarysearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {

            System.out.println("Low is "+l);
            System.out.println("High is "+(r+1));
            int mid = l + (r - l) / 2;

            System.out.println("mid is "+mid);
            System.out.println("Searching");

            if (arr[mid] == x)

                return mid;


            if (arr[mid] > x)

                return binarysearch(arr, l, mid - 1, x);


            return binarysearch(arr, mid + 1, r, x);

        }

        return -1;
    }
    static void bubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = 0;
             i < n - 1;
             i++) {

            for (int j = 0;
                 j < n - i;
                 j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter 11 numbers:");

        int arr[] = new int[11];
        int num;
        int n = arr.length;
        int resultant;


        for (int i=0;
            i<11;
            i++) {

            System.out.print("Integer "+(i+1)+": ");
            arr[i]=scan.nextInt();
        }

        System.out.print("What is the target number ");
        num = scan.nextInt();
        bubbleSort(arr);

        System.out.print("The sorted set is : ");
        for (int i=0;
            i<11;
            i++) {

            System.out.print(arr[i]+" ");
        }

        resultant = binarysearch(arr, 0, n - 1, num);

        if (resultant == -1)

            System.out.println("The target is not in set.");

        else
            System.out.println("The target is in set.");
    }
}