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
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=slow;
        ListNode second=reverse(slow.next);
        slow.next=null;
        ListNode first=head;
        while(second!=null){
            ListNode t1=first.next;
            ListNode t2=second.next;
            first.next=second;
            second.next=t1;
            first=t1;
            second=t2;
        }
    }
    private ListNode reverse(ListNode head){
        if(head==null) return null;
        ListNode curr=head;
        ListNode prev=null;
        ListNode front=null;
        while(curr!=null){
            front =curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}