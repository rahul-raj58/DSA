class Solution {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int vis[]){
        vis[node] = 1; 
        for(Integer it: adj.get(node)) {
            if(vis[it] == 0) {
                dfs(it, adj, vis); 
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && isConnected[i][j] == 1){
                    adj.get(i).add(j);
                    // adj.get(j).add(i);
                }
            }
        }
        int vis[] = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            if(vis[i] == 0){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;

    }
}