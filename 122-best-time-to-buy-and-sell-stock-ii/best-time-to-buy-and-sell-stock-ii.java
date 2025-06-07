class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][] dp = new int[n+1][2];
        for (int i=0; i<=n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return f(0,prices,1,dp);
        
    }
    public int f(int ind, int[] prices, int buy, int[][] dp){
        if(ind == prices.length){
            return 0;
        }
        if(dp[ind][buy] != -1){
            return dp[ind][buy];
        }
        int profit = 0;
        if(buy == 1){
            profit = Math.max((-prices[ind] + f(ind+1,prices,0,dp)),(0 + f(ind+1,prices,1,dp)));
        }
        else{
            profit = Math.max((prices[ind] + f(ind+1,prices,1,dp)),(0 + f(ind+1,prices,0,dp)));
        }
        return dp[ind][buy] = profit;
    }
}