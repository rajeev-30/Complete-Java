package ARRAYS;

public class Min_element_array {
    public static void main(String[] args) {
        // Wap to find the minimum element in an array;
        int arr[] = { 14, 2, 333, 4, 5, 88, 0, 98, 99 };
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }

}
