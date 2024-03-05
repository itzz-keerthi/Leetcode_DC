class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){

            if(i==j){
                return 1;
            }

            if(s.charAt(i)!=s.charAt(j)){
                return j-i+1;
            }
            char target=s.charAt(i);
            while( (i<s.length()) && (s.charAt(i)==target)){
                i++;       
            }
            while( (j>=0) && (s.charAt(j)==target)){
                j--;
            }
        } 
        return 0;   
    }
}
