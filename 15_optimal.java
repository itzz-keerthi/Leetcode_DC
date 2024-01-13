class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> arr=new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    res.add(arr);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        /*for(int i=0;i<nums.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    
                    if((nums[i]+nums[j]+nums[k]==0) && (i!=j && j!=k && i!=k)){
                        List<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);arr.add(nums[j]);arr.add(nums[k]);
                        Collections.sort(arr);
                        if(!res.contains(arr))
                        res.add(arr);
                    }
                    
                }
                int check=(nums[i]+nums[j])*(-1);
                if(set.contains(check)){
                    List<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);arr.add(nums[j]);arr.add(check);
                        Collections.sort(arr);
                        if(!res.contains(arr))
                        res.add(arr);
                }
                set.add(nums[j]);
            }
        }*/
        return res;
    }
}


/*
TC: O(logN) + O(N^2)
SC: O(no. of unique triplets
*/
