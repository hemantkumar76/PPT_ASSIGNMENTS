import java.util.HashMap;
import java.util.Map;

public class qs_3 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int longestSubsequence = 0;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (countMap.containsKey(num + 1)) {
                int subsequenceLength = countMap.get(num) + countMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, subsequenceLength);
            }
        }

        return longestSubsequence;
    }
}
