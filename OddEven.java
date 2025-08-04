import java.util.Scanner;

public class OddEven {

    public static void OddEvenChecker(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Odd count in array: " + oddCount + "\n Even Count in array: " + evenCount);
    }

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

        OddEvenChecker(arr);
        sc.close();
    }
}
