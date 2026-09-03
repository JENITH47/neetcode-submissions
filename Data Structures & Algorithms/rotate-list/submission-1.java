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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode a=head;
        int size=0;
        while(a!=null){
            size++;
            a=a.next;
        }
        k=k%size;
        while(k>0){
            a=head;
            while(a.next.next!=null){
                a=a.next;

            }
            a.next.next=head;
            head=a.next;
            a.next=null;
            k--;

        }
        return head;

    }
}