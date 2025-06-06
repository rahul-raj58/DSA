class Solution {
    public int climbStairs(int n) {
       int dp[] = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        } 
        return climbStairsDP(n,dp);
        
    }
    public int climbStairsDP(int n, int dp[]) {
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = climbStairsDP(n-1,dp) + climbStairsDP(n-2,dp);
        return dp[n];
    }
    
}