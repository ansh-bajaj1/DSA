/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        Map<Node,Node> map=new HashMap<>();
        while(temp!=null){
            Node c = new Node(temp.val);
            map.put(temp,c);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            Node n = map.get(temp);
            n.next=map.get(temp.next);
            n.random=map.get(temp.random);
            temp=temp.next;

        }
        return map.get(head);
    }
}