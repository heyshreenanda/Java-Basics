import java.util.Scanner;

class rev {
    public static void reversed(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (start < end) {

                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("Reversed elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter ur elements of size: " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

        rev.reversed(arr);

        sc.close();
    }
}