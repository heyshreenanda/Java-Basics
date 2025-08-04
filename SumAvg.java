class SumAvg {
    public static void main(String[] args) {
        int arr[] = { 1, 12, 34, 67, 78, 89, 90 };
        int sum = 0, avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
}