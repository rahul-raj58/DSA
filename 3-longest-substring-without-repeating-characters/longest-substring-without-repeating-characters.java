class Solution {
    public int lengthOfLongestSubstring(String s) {

        // hashing --> O(n^2)  

        // int n = s.length();
        // int len = 0; 
        // int maxLength = Integer.MIN_VALUE;
        // if(s.length()==0)
        //      return 0;
        // for(int i=0; i<n; i++){
        //     Set <Character> set = new HashSet<>();
        //     for(int j=i; j<n; j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         len = j-i+1;
        //         maxLength = Math.max(len,maxLength);
        //         set.add(s.charAt(j));
        //     }  
        // }
        // return maxLength;

        // sliding window two pointer approach --> O(n)

        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int n = s.length();
        int length = 0; 
        
        while(r<n){
            if (map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l) {
                l = map.get(s.charAt(r)) + 1;
            }   
            map.put(s.charAt(r), r);
            length = Math.max(length, r-l+1);
            r++;
        }
        return length;

    }
}

