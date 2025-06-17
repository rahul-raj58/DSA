class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int count = 0;
            if(list.contains(nums[i])) continue;
            for(int j=i; j<n; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count > n/3){
                list.add(nums[i]);
            }
            if (list.size() == 2) break;
        }
        return list;
    }
}