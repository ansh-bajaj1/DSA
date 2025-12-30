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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode t1 = head;

        while (t1 != null) {
            if (t1.next != null && t1.val == t1.next.val) {
                int val = t1.val;

    while (t1 != null && t1.val == val) {
                    t1 = t1.next;
                }

                prev.next = t1;
            } else {
                prev = t1;
                t1 = t1.next;
            }
        }

        return dummy.next;
    }
}
