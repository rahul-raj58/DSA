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


        // HashMap TC --> O(n*log n)

        //  int n = nums.length;
        //  HashMap<Integer, Integer> map = new HashMap<>();
        //  for(int i=0; i<n; i++){
        //     int num = nums[i];
        //     int moreNeed = target - num; 
        //     if(map.containsKey(moreNeed)){
        //         return new int[]{map.get(moreNeed),i};
        //     }
        //     map.put(nums[i],i);
        //  }
        //  return null;

        // 2 - pointer TC --> O(n*log n)
        int n = nums.length; 
        int left = 0;
        int right = n-1;
        ArrayList<Pair> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            list.add(new Pair(nums[i], i));
        }
        Collections.sort(list, (o1, o2) -> o1.val - o2.val);
        while(left<right){
            int sum = list.get(left).val + list.get(right).val;
            if(sum == target){
                return new int[]{list.get(left).index, list.get(right).index};
            }
            else if(sum < target){
                left ++;
            }
            else{
                right--;
            }

        }
        return new int[]{};
        
    }
}
class Pair {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }