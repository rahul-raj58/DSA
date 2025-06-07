class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int case1 = robR(0,n-2,nums,dp);
        Arrays.fill(dp,-1);
        int case2 = robR(1,n-1,nums,dp);
        return Math.max(case1, case2);
    }
    public int robR(int i, int ind, int[] nums, int[] dp){
        
        if(i>ind){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int notPick = 0 + robR(i+1,ind,nums,dp);
        int pick = nums[i] + robR(i+2,ind,nums,dp);
        
        return dp[i] = Math.max(pick,notPick);
        
    }
}


