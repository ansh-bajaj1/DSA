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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;
        }
        temp = head;
        int i = 1;
        ListNode curr = head;
        while (temp != null) {
            if (i == k) {
                break;
            }
            temp = temp.next;
            i++;
        }
        ListNode n = temp;
        while (temp.next != null) {
            curr = curr.next;
            temp = temp.next;
        }
        int t = curr.val;
        curr.val=n.val;
        n.val=t;

        return head;

    }
}