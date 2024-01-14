class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int check=Math.min(height[i],height[j]);
        int max=check*(j-i);
        while(i<j){
            if(height[i]<height[j]){
                int min=Math.min(height[i],height[j]);
                max=Math.max(max,min*(j-i));
                i++;
            }
            else{
                int min=Math.min(height[i],height[j]);
                max=Math.max(max,min*(j-i));
                j--;
            }
        }
        return max;
    }
}

/*
TC: O(n/2)
SC: O(1)
*/
