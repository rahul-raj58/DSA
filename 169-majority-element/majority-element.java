class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
    //     for(int i=0; i<n; i++){
    //         int count = 0;
    //         for(int j=i; j<n; j++){
    //             if(nums[j] == nums[i]){
    //                 count++;
    //             }
    //         }
    //         if(count > n/2){
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    // hashMap

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }

        }
        for(Map.Entry<Integer, Integer> it: map.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
}