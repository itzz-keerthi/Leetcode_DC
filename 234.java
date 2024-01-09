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
        Stack<Integer> res=new Stack<>();
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
        return true;
    }
}
