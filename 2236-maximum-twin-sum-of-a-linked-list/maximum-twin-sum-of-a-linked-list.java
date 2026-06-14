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
    public int pairSum(ListNode head) {
        ListNode p = head;
        int max=Integer.MIN_VALUE;
        int c=0;
        while(p!=null){
            c++;
            p=p.next;
        }
        int[] arr = new int[c];
        p=head;
        int i=0;
        while(p!=null){
            arr[i++]=p.val;
            p=p.next;
        }
        for(i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]+arr[arr.length-i-1]);
        }
        return max;
    }
}