class ArrEx1 {
    public static void main(String[] args) {
        int arr[] = m1();

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static int[] m1() {
        return new int[] { 1, 2, 3 };
    }
}