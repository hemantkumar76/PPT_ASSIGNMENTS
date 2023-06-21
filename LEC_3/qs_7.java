import java.util.*;

public class qs_7 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        
        if (nums[0] > lower) {
            result.add(formatRange(lower, nums[0] - 1));
        }
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                result.add(formatRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }
                if (nums[nums.length - 1] < upper) {
            result.add(formatRange(nums[nums.length - 1] + 1, upper));
        }
        
        return result;
    }
    
    private String formatRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }
}
