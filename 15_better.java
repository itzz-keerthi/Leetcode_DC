class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                /*for(int k=j;k<nums.length;k++){
                    
                    if((nums[i]+nums[j]+nums[k]==0) && (i!=j && j!=k && i!=k)){
                        List<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);arr.add(nums[j]);arr.add(nums[k]);
                        Collections.sort(arr);
                        if(!res.contains(arr))
                        res.add(arr);
                    }
                    
                }*/
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
        }
        return res;
    }
}

/*
TC: N^2 x log(M) M is the varying size of hashset
SC: O(N) + O(no. of unique triplets)
*/ 
