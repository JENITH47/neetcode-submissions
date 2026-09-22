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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode start=null;
        int i=0;

        while(i<left-1){
            start=temp;
            temp=temp.next;
            i++;
        }
        ListNode prev=null;
        ListNode curr=temp;
        ListNode x=temp;
        ListNode next=curr.next;
        
        while(i<right){
            // ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)
            next=next.next;
            i++;
        }
        if(start!=null){
            start.next=prev;

        }
        else{
            head=prev;
        }
        
        x.next=curr;
        return head;

    }
}