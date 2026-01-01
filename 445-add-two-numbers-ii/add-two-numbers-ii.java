class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = reverse(l1);
        ListNode t2 = reverse(l2);

        int carry = 0;
        ListNode dummy=new ListNode(-1);
        ListNode head = dummy;

        while (t1 != null || t2 != null || carry != 0) {
            int sum = carry;

            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }

            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);

            head.next = node;
            head = head.next;
        }

        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
