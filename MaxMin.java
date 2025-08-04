import java.util.Scanner;

class Checker {
    public static void MaxandMin(int arr[]) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("MIN AND MAX ARE: " + min + "    " + max);

    }
}

public class MaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number of elements in array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter ur arrays elements of size " + n + " : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Arrays elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        Checker.MaxandMin(arr);

        sc.close();

    }
}
