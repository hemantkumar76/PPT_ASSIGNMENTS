import java.util.Arrays;

public class qs_1 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; 

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1; 

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; 

                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++; 
                } else {
                    right--; 
                }
            }
        }

        return closestSum;
    }
}
