class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length; 
        int m = nums2.length;
        int nge[] = new int[n];
        for(int i=0; i<n; i++){
            int index = -1;
            for(int j=0; j<m; j++){
                if(nums2[j] == nums1[i]){
                    index = j;
                    break;
                }
            }
            int nextGreater = -1;
            for(int k=index+1; k<m; k++){
                if(nums2[k] > nums1[i]){
                    nextGreater = nums2[k];
                    break;
                }
            }
            nge[i] = nextGreater;
        }

        return nge;
    }
}