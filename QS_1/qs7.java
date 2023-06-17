class Solution {
    public void moveZeroes(int[] nums) {
        int insertIndex = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertIndex] = num;
                insertIndex++;
            }
        }

        while (insertIndex < nums.length) {
            nums[insertIndex] = 0;
            insertIndex++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        System.out.print("Modified Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
