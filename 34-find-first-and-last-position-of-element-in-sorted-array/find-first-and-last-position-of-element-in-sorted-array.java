class Solution {
    public int getCeil(int [] nums, int target){
        int low = 0; 
        int high = nums.length - 1;
        int ceil = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
                ceil = mid; 
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (ceil != -1 && nums[ceil] != target) ? -1 : ceil;
    }
    public int getFloor(int [] nums, int target){
        int low = 0; 
        int high = nums.length - 1;
        int floor = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] <= target){
                floor = mid; 
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return (floor != -1 && nums[floor] != target) ? -1 : floor;

    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int ceil = getCeil(nums,target);
        int floor = getFloor(nums,target);
        return new int[]{ceil,floor};
    }
}