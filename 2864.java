class Solution {

    public void reverse(char a[]){
        int i=0;
        int j=a.length-1;
        while(i<=j){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    public String maximumOddBinaryNumber(String s) {
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        reverse(arr);
        for(int i=arr.length-1;i>=0;i--){
            //System.out.print(i+" ");
            if(arr[i]=='1'){
                arr[i]='0';
                arr[arr.length-1]='1';
                break;
            }

        }
        String ans="";
        for(char l:arr){
            ans+=l;
        }
        return ans;
    }
}
