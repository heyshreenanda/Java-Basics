import java.util.Scanner;

public class PrintingMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print(" Enter number of columns: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();
    }
}
