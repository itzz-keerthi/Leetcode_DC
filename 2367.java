class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> res=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
        for(int j:nums){
            if(res.contains(j+diff) && res.contains(j-diff)){
                count++;
            }
        }
        /*
        HashSet<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((j>i && j<k) && (nums[j]-nums[i]==diff) && (nums[k]-nums[j]==diff)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);temp.add(nums[j]);temp.add(nums[k]);
                        Collections.sort(temp);
                        res.add(temp);
                    }
                }
            }
        }
        return res.size();*/
        return count;
        
    }
}

/*
TC: O(n)
SC: O(n)
*/
