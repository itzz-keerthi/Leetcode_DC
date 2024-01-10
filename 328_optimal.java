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
    public ListNode oddEvenList(ListNode head) {
        //optimal approach
        //Step 1: Change the links of odd indexes
        //Step 2: Change the links of even indexes
        //Step 3: Connect the last odd index to the start of even(head.next)

        if(head==null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;
        
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        //odd=odd.next;
        //System.out.println(even.val);
        odd.next=evenhead;
        return head;
        /*List<Integer> res=new ArrayList<>();
        //Queue<Integer> res=new PriorityQueue<>();
        //Stack<Integer> res=new Stack<>();
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            
            if(c%2==0){
                res.add(temp.val);
                System.out.println(temp.val);
            }
            c++;
            temp=temp.next;
        }
        ListNode temp2=head;
        int c1=0;
        while(temp2!=null){
            if(c1%2!=0){
                res.add(temp2.val);
            }
            c1++;
            temp2=temp2.next;
        }
        //System.out.println(res);
        ListNode result=head;
        int i=0;
        while(result!=null){
            result.val=res.get(i++);
            result=result.next;
        }
        return head;*/
    }
}
