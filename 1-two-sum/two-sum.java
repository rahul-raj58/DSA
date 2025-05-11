class Solution {
    public int[] twoSum(int[] nums, int target) {

        // TC --> O(n^2)

        // int n = nums.length; 
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};


         // HashMap
         int n = nums.length;
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0; i<n; i++){
            int num = nums[i];
            int moreNeed = target - num; 
            if(map.containsKey(moreNeed)){
                return new int[]{map.get(moreNeed),i};
            }
            map.put(nums[i],i);
         }
         return null;
        
    }
}