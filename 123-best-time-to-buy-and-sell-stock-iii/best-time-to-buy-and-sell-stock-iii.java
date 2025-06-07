class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][][] dp = new int[n+1][2][3];
        for (int i=0; i<n; i++) {
            for (int j=0; j<2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return f(0,prices,1,2,dp);
        
    }
    public int f(int ind, int[] prices, int buy, int cap, int[][][] dp){
        if(ind == prices.length){
            return 0;
        }
        if(cap == 0){
            return 0;
        }
        if(dp[ind][buy][cap] != -1){
            return dp[ind][buy][cap];
        }
        int profit = 0;
        if(buy == 1){
            profit = Math.max((-prices[ind] + f(ind+1,prices,0,cap,dp)),(0 + f(ind+1,prices,1,cap,dp)));
        }
        else{
            profit = Math.max((prices[ind] + f(ind+1,prices,1,cap-1,dp)),(0 + f(ind+1,prices,0,cap,dp)));
        }
        return dp[ind][buy][cap] = profit;
    }
}