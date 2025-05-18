class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];

        }
        if(sum%2 != 0){
            return false;
        }
        int target = sum/2;
        int N = nums.length;
        int dp[][] = new int[N][target+1];
        for(int row[]: dp){
            Arrays.fill(row,-1);
        }
        return helper(N-1,nums,target,dp);
    }
    public static Boolean helper(int ind, int arr[], int sum, int dp[][]){
        if(sum == 0){
            return true;
        }
        if(ind == 0){
            return arr[0] == sum;
        }
        if(dp[ind][sum] != -1){
            return dp[ind][sum] == 1 ? true : false;
        }
        boolean notTake = helper(ind-1,arr,sum,dp);
        boolean take = false;
        if(arr[ind] <= sum){
            take = helper(ind-1,arr,sum-arr[ind],dp);
        }
        dp[ind][sum] = notTake || take ? 1 : 0;
        return notTake || take;
    }
}


    
    
