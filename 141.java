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
        HashMap<ListNode,Integer> res=new HashMap<>();
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
    }
}
