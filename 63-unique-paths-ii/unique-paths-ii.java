class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
       
        return f(obstacleGrid,m-1,n-1,dp);
        
    }
    public int f(int[][] grid, int i, int j, int dp[][]){
        if(i>=0 && j>=0 && grid[i][j] == 1){
            return 0;
        }
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = f(grid,i-1,j,dp);
        int left = f(grid,i,j-1,dp);
        return dp[i][j] = (up + left);
    }
    
    
}


