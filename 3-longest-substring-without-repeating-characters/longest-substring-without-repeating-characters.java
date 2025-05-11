class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int len = 0; 
        int maxLength = Integer.MIN_VALUE;
        if(s.length()==0)
             return 0;
        for(int i=0; i<n; i++){
            Set <Character> set = new HashSet<>();
            for(int j=i; j<n; j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                len = j-i+1;
                maxLength = Math.max(len,maxLength);
                set.add(s.charAt(j));
            }  
        }
        return maxLength;
    }
}