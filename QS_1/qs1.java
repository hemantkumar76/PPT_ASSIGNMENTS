import java.util.HashMap;
import java.util.Map;

class qs1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complements.containsKey(complement)) {
                return new int[]{complements.get(complement), i};
            }
            complements.put(nums[i], i);
        }

        return new int[0];
    }
}

// Test the solution
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
