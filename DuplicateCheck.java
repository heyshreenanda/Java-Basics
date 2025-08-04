import java.util.Scanner;

public class DuplicateCheck {

    public static void checking(int[] arr) {

        boolean isfound = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    isfound = true;

            }
        }

        if (isfound == false)
            System.out.println("No duplicates found");
        else
            System.out.println(" duplicates found");
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
        checking(arr);
        sc.close();
    }
}
