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
        if(head==null||head.next==null || k==0){
            return head;
        }
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        k = k % c;
        if (k == 0) {
            return head;  
        }
        temp=head;
        int i=0;
        while(i!=c-k-1){
            if(temp!=null){
                temp=temp.next;
            }
            i++;
        }
        
        ListNode nhead = temp.next;
        temp.next=null;
        ListNode last=nhead;
        while(last.next!=null){
            last=last.next;
        }
        last.next=head;

        return nhead;
    }
}