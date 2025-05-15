class Solution {
    // public static boolean linearSearch(int nums[], int num){
    //     int n = nums.length;
    //     for(int i=0; i<n; i++){
    //         if(nums[i] == num){
    //             return true;
    //         }
            
    //     }
    //     return false;
    // }
    public int longestConsecutive(int[] nums) {
        // int n = nums.length;
        // if (n == 0) return 0; 
        // int longest = 1;
        // for(int i=0; i<n; i++){
        //     int x = nums[i];
        //     int cnt = 1;
        //     while(linearSearch(nums, x+1) == true){
        //         x++;
        //         cnt++;
        //     }
        //     longest = Math.max(longest, cnt);
        // }
        // return longest;


        // TC --> O(n)
        int n = nums.length; 
        Arrays.sort(nums);
        int longest = 0;
        int countCurr = 0; 
        int lastSmaller = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i]-1 == lastSmaller){
                countCurr++;
                lastSmaller = nums[i];
            }
            else if(nums[i] != lastSmaller){
                countCurr = 1;
                lastSmaller = nums[i];

            }
            longest = Math.max(longest,countCurr);

        }
        return longest;

    }
}