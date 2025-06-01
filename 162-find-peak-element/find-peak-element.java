class Solution {
    public int findPeakElement(int[] nums) {
        // brute force 
        // int n = nums.length;
        // for(int i=0; i<nums.length; i++){
        //     if((i == 0 || nums[i-1] < nums[i]) && (i == n-1 || nums[i] > nums[i+1])){
        //         return i;
        //     }
        // }
        // return -1;

        // binary search 
        int n = nums.length; 
        if(n==1){
            return 0; 

        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }
            // increasing curve
            if(nums[mid] > nums[mid-1]){
                low = mid+1;
            }
            // decreasing curve
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}