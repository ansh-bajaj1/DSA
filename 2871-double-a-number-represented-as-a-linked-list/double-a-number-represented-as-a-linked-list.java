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
    public ListNode doubleIt(ListNode head) {
        if (head == null) return head;

        head = reverse(head);

        ListNode temp = head;
        int c = 0;

        while (temp != null) {
            int d = temp.val;
            temp.val = (d * 2 + c) % 10;
            c = (d * 2 + c) / 10;
            if (temp.next==null && c > 0) {
            ListNode n = new ListNode(c);
            temp.next = n;
            break;
        }
            temp = temp.next;
        }

        

        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode front = null;

        while (curr != null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
}
