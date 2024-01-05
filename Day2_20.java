class Solution {
    public boolean isValid(String s) {
        Stack<Character> res=new Stack<>();
        for(int i=0;i<s.length();i++){
            char target=s.charAt(i);
            if(target=='(' || target=='{' || target=='['){
                res.push(target);
            }
            else{
                if(res.isEmpty()){
                    return false;
                }
                char check=res.pop();
                if((target==')' && check!='(') || (target=='}' && check!='{') || (target==']' && check!='[')){
                    return false;
                }
            }
        }
        return res.isEmpty();
    }
}
