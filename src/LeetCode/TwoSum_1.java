package LeetCode;

public class TwoSum_1 {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target){
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                k = nums[i] + nums[j];
                int[] sum = new int[]{i, j};
                if (k == target) return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No solution for defined input data");
    }
}
