class qs2 {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; 
            }
        }

        return k;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);
        System.out.println("Count: " + k);

        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
