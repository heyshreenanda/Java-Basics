import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements u want in array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = n - 1;
        System.out.println("enter n-1 array elements in order: ");
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1 = 0, sum2 = 0;
        // total sum
        for (int i = 0; i <= n; i++) {
            sum1 += i;
        }

        // sum from array
        for (int i = 0; i < k; i++) {
            sum2 += arr[i];
        }

        int missing = sum1 - sum2;

        System.out.println("missing element is: " + missing);
        sc.close();
    }
}
