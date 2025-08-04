import java.util.Scanner;

class Rotate{
    public static void rotater(int[] arr){
        int temp = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array elemnts: ");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array elemnts before rotation: ");
        for(int i =0; i<n;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.print("\nenter the number of rotations: ");
        int k = sc.nextInt();

        if(k>n){
            for(int i = 0; i< k%n; i++ ){
                rotater(arr);
            }
        }else{
            for(int i = 0; i<k; i++){
                rotater(arr);
            }
        }

        System.out.println("final output: ");
        for(int i =0; i<n;i++){
        System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}  
                
            

        

    