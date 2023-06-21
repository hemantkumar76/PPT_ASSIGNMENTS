import java.util.Arrays;

public class qs_5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int alternativeProduct = nums[0] * nums[1] * nums[n - 1];

        return Math.max(maxProduct, alternativeProduct);
    }
}
