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
    public boolean isPalindrome(ListNode head) {
        /*Approach
        Step 1: find the middle of the linkedlist so that operations can be handled inn one half of the linked list
        Step 2: reverse the one half of the linkedlist
        Step 3: compare the first half with the second half
        Step 4: Again reverse the second half of the linkedlist in order to obtain the original linkedlist*/
        /*Stack<Integer> res=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            res.push(temp.val);
            temp=temp.next;
        }
        ListNode check=head;
        while(check!=null){
            if(check.val!=res.pop()){
                return false;
            }
            //res.pop();
            check=check.next;

        }
        //System.out.println(res);
        return true;*/
        //using tortoise hare
        ListNode slow=head; ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null){
            if(first.val!=second.val){
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;
    }
    public ListNode reverse(ListNode node){
        /*Stack<Integer> res=new Stack<>();
        ListNode t=node;;
        while(t!=null){
            res.push(t.val);
            t=t.next;
        }
        ListNode r=node;
        while(r!=null){
            r.val=res.peek();
            res.pop();
            r=r.next;
        }
        return node;*/
        if(node==null || node.next==null){
            return node;
        }
        ListNode newhead=reverse(node.next);
        ListNode front=node.next;
        front.next=node;
        node.next=null;
        return newhead;
    }
}
