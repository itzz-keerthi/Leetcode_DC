class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        // for(int j=1;j<max;j++){
        //     int totalhours=reqtime(piles,j);
        //     if(totalhours<=h){
        //         return j;
        //     }
        // }
        // return max;
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int totalhours=reqtime(piles,mid);
            if(totalhours>h){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

    public int reqtime(int arr[],int h){
        int totalhours=0;
        for(int m=0;m<arr.length;m++){
            totalhours+=Math.ceil((double)arr[m]/(double)h);
        }
        return totalhours;
    }

}
