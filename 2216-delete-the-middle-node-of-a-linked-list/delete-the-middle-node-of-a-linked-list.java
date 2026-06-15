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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode ptr = head;
        ListNode slow = head;
        ListNode prev = slow;
        while(ptr!=null && ptr.next!=null){
            prev=slow;
            slow=slow.next;
            ptr=ptr.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}