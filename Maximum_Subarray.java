class Solution {
    public int maxSubArray(int[] A) {
            int n = A.length;
            int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
            dp[0] = A[0];
            int max = dp[0];
            
            for(int i = 1; i < n; i++){
                dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
                max = Math.max(max, dp[i]);
            }
            
            return max;
    }
}


/*
Kadane's algorithm:
    https://en.wikipedia.org/wiki/Maximum_subarray_problem
*/
/*class Solution {
    public int maxSubArray(int[] nums) {        
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxCur = nums[0];
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            maxCur = Math.max(nums[i], nums[i] + maxCur);
            result = Math.max(maxCur, result);
        }
        return result;
    }
}
*/
