/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node deleteHead(Node head) {
        // code here
        if(head == null) return head;
        Node temp = head;
        head = head.next;
        return head;
    }
}