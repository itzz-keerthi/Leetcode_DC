import java.util.*;
class Solution {
    public int minOperations(int[] arr) {
        HashMap<Integer,Integer> res=new HashMap<>();
        HashSet<Integer> uniquearr=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!res.containsKey(arr[i])){
                uniquearr.add(arr[i]);
                res.put(arr[i],1);
            }
            else{
                int val=res.get(arr[i]);
                val=val+1;
                res.put(arr[i],val);
            }
        }
        int min_operations=0;
        for(Integer i:uniquearr){ 
            int value=res.get(i);
            if(value==1){
                return -1;
            }
            int quotient=value/3;
            int rem=value%3;
            int r;
            if(rem==0){
                r=0;
            }
            else{
                r=1;
            }
            min_operations+=quotient+r;
        }
        return min_operations;
    }
}
