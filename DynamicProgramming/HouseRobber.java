import java.util.Arrays;

public class HouseRobber {
    
    public int solveUsingRec1(int[] nums, int index, int[] dp) {
        // Base case
        if (index <= 0) return 0;
        
        // Check if already calculated
        if (dp[index] != -1) {
            return dp[index];
        }
        
        // Recurrence relation
        int robbed = nums[index] + solveUsingRec1(nums, index - 2, dp);
        int notRobbed = solveUsingRec1(nums, index - 1, dp);
        dp[index] = Math.max(robbed, notRobbed);
        
        return dp[index];
    }

    public int solveUsingTabulation1(int[] nums, int[] dp) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
    
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
    
        for (int index = 2; index < nums.length; index++) {
            int temp = 0;
            if (index - 2 >= 0) temp = dp[index - 2];
            int robbed = nums[index] + temp;
            int notRobbed = dp[index - 1];
            dp[index] = Math.max(robbed, notRobbed);
        }
        return dp[n - 1];
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        
        return solveUsingRec1(nums, nums.length - 1, dp);
    }

    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(hr.rob(nums));  // Output should be 12
    }
}
