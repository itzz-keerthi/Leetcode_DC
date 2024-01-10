/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*int len=0;
        ListNode temp=head;
        while(temp!=null){
            
            temp=temp.next;
            len++;
        }
        int target=len-n;
        if(target==0){
            head=head.next;
            return head;
        }
        ListNode res=head;
        ListNode prev=null;
        int c=0;
        while(res!=null){
            if(c==target){
                prev.next=res.next;
            }
            prev=res;
            res=res.next;
            
            c++;
        }
        return head;*/
        /*Approach
        Using tortoise hare approach
        */
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        ListNode slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            
        }
        slow.next=slow.next.next;
        return head;
    }
}
