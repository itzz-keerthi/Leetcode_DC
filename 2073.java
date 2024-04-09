class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time_taken=0;
        while(tickets[k]>0){
        for(int i=0;i<tickets.length;i++){
            if(tickets[k]>0){
                if(tickets[i]>0){
                    tickets[i]=tickets[i]-1;
                    time_taken++;   
                }
            }
        }
        }
        return time_taken;
    }
}
