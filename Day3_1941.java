class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> res=new HashMap<>();
        for(char i:s.toCharArray()){
            if(!res.containsKey(i)){
                res.put(i,1);
            }

            else{
                int val=res.get(i);
                val=val+1;
                res.put(i,val);
            }
        }
        int target=res.get(s.charAt(0));
        for(char i:s.toCharArray()){
            if(res.get(i)!=target){
                return false;
            }
        }
        return true;
    }
}
