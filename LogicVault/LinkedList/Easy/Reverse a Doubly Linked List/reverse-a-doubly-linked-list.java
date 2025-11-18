/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        
        if(head == null || head.next == null) return head;
        
        Node curr = head;
        Node last = null;
        
        while(curr != null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            curr = curr.prev;
        }
        
        return last.prev; 
    }
}