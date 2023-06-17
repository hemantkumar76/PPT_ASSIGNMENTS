class qs6 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        Solution solution = new Solution();
        boolean containsDuplicate = solution.containsDuplicate(nums);

        System.out.println("Result: " + containsDuplicate);
    }
}
