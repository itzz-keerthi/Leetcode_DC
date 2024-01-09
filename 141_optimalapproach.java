/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //using hashing approach
        /*HashMap<ListNode,Integer> res=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(!res.containsKey(temp)){
                res.put(temp,1);
            }
            else{
                return true;
            }
            temp=temp.next;
        }
        return false;
        */
        //using tortoise hare approach
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
