class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> res=new HashSet<>();
        for(char i:s.toCharArray()){
            if(res.contains(i)){
                return i;
            }
            res.add(i);
        }
        return '0';
    }
}
