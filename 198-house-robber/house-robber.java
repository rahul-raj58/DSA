class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i] = -1;
        }
        return robR(n-1,nums,dp);
    }
    public int robR(int ind, int[] nums, int[] dp){
        if(ind == 0){
            return nums[ind];
        }
        if(ind<0){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int pick = nums[ind] + robR(ind-2,nums,dp);
        int notPick = 0 + robR(ind-1,nums,dp);
        return dp[ind] = Math.max(pick,notPick);
    }
}

