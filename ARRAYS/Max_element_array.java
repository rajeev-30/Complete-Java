package ARRAYS;

public class Max_element_array {
    public static void main(String[] args) {
        // Wap to find the maximum element in an array;
        int arr[] = { 14, 2, 333, 4, 5, 88, 76, 98, 99 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }

}
