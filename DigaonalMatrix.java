import java.util.Scanner;

public class DigaonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int sum1 = 0, sum2 = 0;
        System.out.println("enter data of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("principal diagonal matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = i; j <= i; j++) {
                sum1 += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Secondary diagonal matrix is: ");
        for (int i = 0; i < row; i++) {
            sum2 += matrix[i][row - 1 - i];
            System.out.print(matrix[i][row - 1 - i] + " ");
        }
        System.out.println();
        System.out.println("Principal diagonal matrix sum: " + sum1);
        System.out.println("Secondary diagonal matrix sum: " + sum2);

        sc.close();
    }
}
