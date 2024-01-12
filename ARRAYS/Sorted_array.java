package ARRAYS;

public class Sorted_array {
    public static void main(String[] args) {

        // Wap to find that an array is sorted or not; {Sorted means --> Incrementing
        // order}+
        int arr[] = { 2, 3, 4, 5, 8, 76, 98, 99 };
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("The array is sorted");
        } else
            System.out.println("The array is not sorted!");

    }
}
