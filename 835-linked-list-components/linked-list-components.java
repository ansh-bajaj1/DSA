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
    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        boolean inComponent = false;
        int count = 0;

        while (temp != null) {
            if (find(temp.val, nums)) {
                if (!inComponent) {
                    count++;
                    inComponent = true;
                }
            } else {
                inComponent = false;
            }
            temp = temp.next;
        }
        return count;
    }

    private boolean find(int val, int[] nums) {
        for (int num : nums) {
            if (num == val) return true;
        }
        return false;
    }
}
