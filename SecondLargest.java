import java.util.Scanner;

public class SecondLargest {
    public static void logic(int[] arr) {
        int first = arr[0];
        int second = Integer.MIN_VALUE;

        

        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if(arr[i] > second && arr[i]!= first)    second = arr[i];

        }

        System.out.println("second larget: " + second);
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
