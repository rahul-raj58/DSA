// class Solution {
//     public int calHours(int [] piles, int banana){
//         long total = 0;
//         for(int i: piles){
//             total += (long)Math.ceil((double)i / banana);
//         }
//         return total;
//     }
//     public int minEatingSpeed(int[] piles, int h) {
//         int maxPile = piles[0];

//         for(int i = 1; i < piles.length; i++) {
//             if(piles[i] > maxPile) {
//                 maxPile = piles[i];
//             }
//         }
//         int l = 1;
//         int high = maxPile;
//         while(l <= high){
//             int mid = (l+high)/2;
//             int totalHour = calHours(piles,mid);
//             if(totalHour <= h){
//                 high = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return l;
//     }
// }

class Solution {

    public long calHours(int[] piles, int banana) {

        long total = 0;

        for(int i : piles) {

            total += (long)Math.ceil((double)i / banana);
        }

        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int maxPile = piles[0];

        for(int i = 1; i < piles.length; i++) {

            if(piles[i] > maxPile) {

                maxPile = piles[i];
            }
        }

        int l = 1;
        int high = maxPile;

        while(l <= high) {

            int mid = l + (high - l) / 2;

            long totalHour = calHours(piles, mid);

            if(totalHour <= h) {

                high = mid - 1;
            }
            else {

                l = mid + 1;
            }
        }

        return l;
    }
}