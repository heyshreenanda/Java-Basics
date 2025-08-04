import java.util.Scanner;

public class ThirdLargest {
    public static void logic(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != first && arr[i] != second) {
                third = arr[i];
            }

        }
        System.out.println("the third largest element is: " + third);
    }

    public static void main(String args[]) {
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

        logic(arr);
        sc.close();
    }
}
