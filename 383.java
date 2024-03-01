class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[]=new int[27];

        for(char i:ransomNote.toCharArray()){
            int val=i-'0';
            // System.out.print(val+" ");
            arr[val-48]++;
        }

        for(char k:magazine.toCharArray()){
            int val=k-'0';
            arr[val-48]--;
        }

        for(int l:arr){
            if(l>0){
                return false;
            }
        }
        return true;
        /*HashMap<Character,Integer> res=new HashMap<>();
        for(char i:ransomNote.toCharArray()){
            if(!res.containsKey(i)){
                res.put(i,1);
            }
            else{
                int val=res.get(i);
                res.put(i,val++);
            }
        }
        System.out.print(res);
        return true;*/

    }
}
