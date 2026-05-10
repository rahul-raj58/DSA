class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length; 

        // brute force
        // int arr[] = new int[n-k+1];
        // for(int i=0; i<n-k+1; i++){
        //     int maxEle = nums[i];
        //     for(int j =i; j<i+k; j++){
        //       maxEle = Math.max(maxEle,nums[j]);
        //     }
        //     arr[i] = maxEle;
        // }
        // return arr;

        // Deque approach

        int[] result = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();
        int ind = 0;
        for(int i=0; i<n; i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k-1){
                result[ind] = nums[dq.peekFirst()];
                ind++;
            }
        }
        return result;
    }
}