class Solution {
    public static int findMax(int[] piles ){
        int n = piles.length;
        int max = piles[0];

        for(int i =0 ; i < n ;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        return max;
    }

    public static int findTotalHours(int[] piles , int hours){
        int n = piles.length;
        int totalHrs = 0;
        for(int i =0 ;i <  n; i++){
            totalHrs += Math.ceil((double) piles[i] /(double) hours);       // type casting 
        }

        return totalHrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);

        while(low <= high){
            int mid = (low + high)/2;
            int totalHours = findTotalHours(piles , mid);
            
            if(totalHours <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return low;
    } 
}
