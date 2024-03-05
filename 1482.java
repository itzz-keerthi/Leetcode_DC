class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(((long)m*(long)k)>bloomDay.length){
            return -1;
        }
        int min=bloomDay[0]; int max=bloomDay[1];
        for(int i:bloomDay){
            if(i>max){
                max=i;
            }
            else if(i<min){
                min=i;
            }    
        }
        int low=min; int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if (ifpossible(bloomDay,mid,m,k)==true){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    boolean ifpossible(int arr[],int mid,int m,int k){
        int cnt=0;
        int noofB=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                cnt++;
            }
            else{
                noofB+=(cnt/k);
                cnt=0;
            }
        }
        noofB+=(cnt/k);
        return noofB>=m;
    }
}
