/*
TC: O(1)
SC: O(1)
*/
class Solution {
    public String intToRoman(int num) {
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ths[]={"","M","MM","MMM"};
        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    
        /*HashMap<Integer,Character> res=new HashMap<>();
        res.put(1,'I');
        res.put(5,'V');
        res.put(10,'X');
        res.put(50,'L');
        res.put(100,'C');
        res.put(500,'D');
        res.put(1000,'M');
    
    HashMap<Integer,Integer> freq = new HashMap<>();
    //int arr[]=new int[7];
    int[] arr= {1000,500,100,50,10,5,1};
    String roman=" ";
    while(num>0){
        for(int i=0;i<arr.length;i++){
            if(num<=arr[i]){
                num=num-arr[i];
                //System.out.print("1");
                char a=res.get(arr[i]);
                roman=roman.concat(Character.toString(a));
            }
        }
    }
    return roman;
    */
}
}
