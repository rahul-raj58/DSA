class Pair{
    int first;
    int second; 
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length; 
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int count = 0;
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(grid[row][col] == '1' && vis[row][col] == 0){
                    count++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return count;
    }
    public void bfs(int r, int c, int[][] vis, char[][] grid){
        vis[r][c] = 1;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(r,c));
        int n = grid.length;
        int m = grid[0].length;

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            for(int i = 0; i < 4; i++){
                int nRow = row + delRow[i];
                int nCol = col + delCol[i];
                    if(nRow >= 0 && nRow < n && nCol >=0 && nCol < m && grid[nRow][nCol] == '1' && vis[nRow][nCol] == 0){
                        vis[nRow][nCol] = 1;
                        q.add(new Pair(nRow, nCol));
                    }
                
            }
        }
    }
}