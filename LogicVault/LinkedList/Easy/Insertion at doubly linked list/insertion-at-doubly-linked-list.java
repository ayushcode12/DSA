/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        
        Node temp = head;
        int cnt = 0;
        
        while(temp != null && cnt < p){
            temp = temp.next;
            cnt++;
        }
        
        if(temp == null) return head;
        
        Node front = temp.next;
        
        Node newNode = new Node(x);
        
        newNode.prev = temp;
        newNode.next = front;
        
        temp.next = newNode;
        
        if(front != null) front.prev = newNode;
        
        return head;
    }
    
}