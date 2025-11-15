// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}
*/

// Complete the function
class Solution {
    public static Node deleteHead(Node head) {
        // your code here
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        
        return head;
    }
}