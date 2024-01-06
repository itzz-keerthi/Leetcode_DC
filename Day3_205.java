class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> s_map=new HashMap<>();
        HashMap<Character,Character> t_map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char s_char=s.charAt(i);
            char t_char=t.charAt(i);
            if(!s_map.containsKey(s_char)){
                s_map.put(s_char,t_char);
            }
            else{
                if(t_char!=s_map.get(s_char)){
                    return false;
                }
            }
            if(!t_map.containsKey(t_char)){
                t_map.put(t_char,s_char);
            }
            else{
                if(s_char!=t_map.get(t_char)){
                    return false;
                }
            }
        }
        return true;
    }
}
