class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int n = nums.length;
        // int nge[] = new int[n];
        // Arrays.fill(nge, -1);
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<i+n; j++){
        //         int ind = j%n;
        //         if(nums[ind] > nums[i]){
        //             nge[i] = nums[ind];
        //             break;
        //         }
        //     }
        // }
        // return nge;

        // monotonic stack 
        int n = nums.length; 
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=2*n-1; i>=0; i--){
            while(!st.empty() && st.peek() <= nums[i%n]){
                st.pop();
            }
            if(i<n){
                nge[i] = st.empty()?-1:st.peek();
            }
            st.push(nums[i%n]);
        }
        return nge;
    }
}