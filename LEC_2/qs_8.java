import java.util.Arrays;

public class qs_8 {
    public int minimumScore(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the array in ascending order

        int minScore = nums[n - 1] - nums[0];

        for (int i = 0; i < n - 1; i++) {
            int maxPossible = Math.max(nums[i] + k, nums[n - 1] - k);
            int minPossible = Math.min(nums[i + 1] - k, nums[0] + k);

            minScore = Math.min(minScore, maxPossible - minPossible);
        }

        return minScore;
    }
}
