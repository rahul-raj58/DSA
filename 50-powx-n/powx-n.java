class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long N = n;

        // O(n)

        // if(n<0){
        //     x = 1/x;
        //     N = -N;
        // }
        // for(int i=0;i<N;i++){
        //     ans = ans*x;
        // }
        // return ans;

        if(n<0){
            x = 1/x;
            N = -N;
        }
        while(N > 0){
            if(N%2 == 1){
                ans = ans*x; 
                N--;
            }
            else{
                x *= x;
                N = N/2; 
            }
        }
        return ans;
    }
}