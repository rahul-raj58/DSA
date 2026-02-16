class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        // Build graph
        for(int i = 0; i < prerequisites.length; i++){
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            adj.get(u).add(v);  
        }

        // Indegree array
        int indegree[] = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        // Add nodes with indegree 0
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        int ans[] = new int[numCourses];
        int index = 0;

        // Kahn's Algorithm
        while(!q.isEmpty()){
            int node = q.poll();
            ans[index++] = node;

            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                }
            }
        }

        // Cycle check
        if(index != numCourses) return new int[0];

        return ans;
    }
}
