import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("Enter a number: ");
            int var1 = sc.nextInt();

            System.out.print("Enter another number: ");
            int var2 = sc.nextInt();

            System.out.println(
                    "Now we are implementing simple calculator...  Select ur option \n1. Additon \n2. Subtraction \n3. Multiplication \n4. Division  \n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sum: " + (var1 + var2));
                    break;
                case 2:
                    System.out.println("Subtracted value:" + (var1 - var2));
                    break;
                case 3:
                    System.out.println("Product : " + (var1 * var2));
                    break;
                case 4:
                    if (var2 == 0)
                        System.out.println("Division by 0 is not allowed");
                    else
                        System.out.println("Answer: " + (var1 / var2));
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    sc.close();
                    return;
                default:
                    System.out.println("enter proper value");
                    break;
            }
        }
    }
}