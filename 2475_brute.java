class Solution {
    public int unequalTriplets(int[] nums) {
        //Arrays.sort(nums);
        HashSet<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=j;k<nums.length;k++){
                    if((nums[i]!=nums[j]) && (nums[i]!=nums[k]) && (nums[j]!=nums[k])){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(i);temp.add(j);temp.add(k);
                        Collections.sort(temp);
                        //System.out.println(temp);
                        res.add(temp);
                    }
                }
            }
        }
        //System.out.println(res);
        return res.size();
    }
}
/*
TC:O(n^3)
SC:O(n^3)
*/
