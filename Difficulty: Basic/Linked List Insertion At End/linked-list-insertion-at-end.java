/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        
        if(head == null){
            return new Node(x);
        }
        
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        Node add = new Node(x);
        temp.next = add;
        
        return head;
    }
}