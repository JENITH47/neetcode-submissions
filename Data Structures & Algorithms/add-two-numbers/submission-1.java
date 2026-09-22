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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        ListNode node=new ListNode();
        ListNode temp=node;
        while((temp1!=null || temp2!=null) || carry!=0){

            int add=0;
            if(temp1!=null){
                
                add+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
               
                add+=temp2.val;
                 temp2=temp2.next;
            }
            add+=carry;
            temp.next=new ListNode(add%10);
            temp=temp.next;
            carry=add/10;





        }
        return node.next;
    }
}
