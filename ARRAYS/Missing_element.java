package ARRAYS;

public class Missing_element {
    public static void main(String[] args) {
        // WAP to find missing element in an array;
        int nums[] = { 1, 2, 3, 5 };
        int n = nums.length;

        int sum = ((n + 1) * (n + 2)) / 2; // logic

        for (int i = 0; i < n; i++)
            sum -= nums[i];

        System.out.println(sum);
    }

}
