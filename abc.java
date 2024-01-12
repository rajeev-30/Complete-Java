public class abc {
    public static int[] twoSum(int[] nums, int target) {
        int i = 1, a = 0;
        int ans[] = new int[2];
        while (a < nums.length) {
            if (nums[a] + nums[i] == target) {
                ans[0] = a;
                ans[1] = i;
                return ans;
            }
            i++;
            if (i == nums.length) {
                a = a + 1;
                if (a < nums.length - 1)
                    i = a + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        twoSum(nums, 8);
        for (int el : twoSum(nums, 8)) {
            System.out.println(el);
        }
    }
}