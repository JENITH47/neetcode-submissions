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
    public void reorderList(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode pres=s;
        ListNode prev=null;
        ListNode next=s.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
            next=next.next;}
        }
        ListNode first=head;
        ListNode second=prev;


        while(second.next!=null){
            ListNode fn=first.next;
            ListNode sn=second.next;
            first.next=second;
            second.next=fn;
            first=fn;
            second=sn;
        }

        

        
    }
}
