import java.util.*;

public class TriangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        int sum1 = 0, sum2 = 0;
        System.out.println("enter matrix element: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
                sum1 += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of lower triangle is: " + sum1);

        for (int i = 0; i < row; i++) {
            for (int j = col - 1; j >= i; j--) {
                sum2 += matrix[i][j];
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Sum of upper triangle is: " + sum2);
        sc.close();
    }
}
