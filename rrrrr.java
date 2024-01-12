class rrrrr {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            l = i;
        }

        int sum = arr[0] + arr[l];
        System.out.println("sum: " + sum);

    }
}