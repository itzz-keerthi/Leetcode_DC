class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    
                    if((nums[i]+nums[j]+nums[k]==0) && (i!=j && j!=k && i!=k)){
                        List<Integer> arr=new ArrayList<>();
                        arr.add(nums[i]);arr.add(nums[j]);arr.add(nums[k]);
                        Collections.sort(arr);
                        if(!res.contains(arr))
                        res.add(arr);
                    }
                    
                }
            }
        }
        return res;
    }
}

/*
TC: O(n^3) x log(no. of unique combinations in res)
SC: 2 x O(no. of triplets present)
*/
