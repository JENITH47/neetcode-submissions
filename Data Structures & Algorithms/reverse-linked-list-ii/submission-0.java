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
        if(head==null || head.next==null || left==right){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        for(int i=1;curr!=null && i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode start=prev;
        ListNode end=curr;
        ListNode next=curr.next;
        for(int i=0;i<right-left+1;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(start!=null){
            start.next=prev;

        }
        else{
            head=prev;
        }
        
        end.next=curr;
        return head;
    }
}