class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        // Brute

        // List<Integer> list = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     int count = 0;
        //     if(list.contains(nums[i])) continue;
        //     for(int j=i; j<n; j++){
        //         if(nums[j] == nums[i]){
        //             count++;
        //         }
        //     }
        //     if(count > n/3){
        //         list.add(nums[i]);
        //     }
        //     if (list.size() == 2) break;
        // }
        // return list;

        // Hashing 
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue() > n/3){
                list.add(it.getKey());
            }
        }
        return list;


    }
}