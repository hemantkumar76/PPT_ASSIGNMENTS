class qs8 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        Arrays.sort(nums);

        int duplicate = -1;
        int missing = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        if (nums[n - 1] != n) {
            missing = n;
        }

        result[0] = duplicate;
        result[1] = missing;

        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        Solution solution = new Solution();
        int[] result = solution.findErrorNums(nums);

        System.out.println("Result: " + Arrays.toString(result));
    }
}
