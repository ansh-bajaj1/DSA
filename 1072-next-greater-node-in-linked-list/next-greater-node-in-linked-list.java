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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        
        int i=0,c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int[] ans = new int[c];
        temp=head;
         
        while(temp!=null){
        int a = temp.val;
        ListNode curr =temp.next;
        while(curr!=null){
            if(curr.val>a){
                ans[i]=curr.val;
                break;
            }
            curr=curr.next;
        }
        i++;
        temp=temp.next;
        }
        return ans;
    }
}