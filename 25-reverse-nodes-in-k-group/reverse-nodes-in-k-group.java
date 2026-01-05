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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode temp = head;
         if (head == null || k == 1) return head;
        while (temp != null) {
            ListNode chead=temp;
            ListNode curr = getkNode(temp, k);
            if (curr == null){
                if(prev!=null)
                prev.next=temp;
                break;
            }
           ListNode newhead = curr.next;
            curr.next = null;
            ListNode r = reverse(chead, k);
            prev.next=r;
            chead.next=newhead;

            prev = chead;
            temp = newhead;

        }
        return dummy.next;
    }

    private ListNode getkNode(ListNode n, int k) {
        while (n != null && k > 1) {
            n=n.next;
            k--;
        }
        return n;
    }

    private ListNode reverse(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode front = null;
        while (k>0 && curr!=null) {
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
            k--;
        }
        return prev;
    }
}