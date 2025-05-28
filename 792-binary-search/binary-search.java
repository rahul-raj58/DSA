class Solution {
    public int search(int[] nums, int target) {
        return searchNum(nums,0,nums.length-1,target);
        
        
    }
    public int searchNum(int nums[], int si, int ei, int target){
        if(si>ei){
            return -1;
        }
        int midIndex = si+(ei-si)/2;
        if(nums[midIndex] == target){
            return midIndex;
        }
        else if(nums[midIndex] < target){
            return searchNum(nums,midIndex+1,ei,target);
        }
        
        else{
            return searchNum(nums,si,midIndex-1,target);
        }
    }
}