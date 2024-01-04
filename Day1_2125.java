class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> res=new ArrayList<>();
        int laserbeams=0;
        for(String i:bank){
            int val=noofones(i);
            //System.out.println(val);
            if(val>0){
                res.add(val);
            }
        }
        for(int m=0;m<res.size()-1;m++){
                System.out.println(laserbeams);
                laserbeams+=(res.get(m)*res.get(m+1));
            }
        return laserbeams;
    }
    public int noofones(String s){
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones+=1;
            }
        }
        return ones;
    }
}
