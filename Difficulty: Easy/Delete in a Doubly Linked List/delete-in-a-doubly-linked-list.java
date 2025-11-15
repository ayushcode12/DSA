/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        
        int cnt = 0;
        Node temp = head;
        
        while(temp != null){
            cnt++;
            if(cnt == x) break;
            temp = temp.next;
        }
        
        Node back = temp.prev;
        Node front = temp.next;
        
        if(back == null && front == null) return null;
        
        else if(back == null) return deleteHead(head);
        
        else if(front == null) return deleteTail(head);
        
        back.next = front;
        front.prev = back;
        
        temp.next = null;
        temp.prev = null;
        
        return head;
    }
    
    public Node deleteHead(Node head){
        if(head == null || head.next == null) return null;
        
        Node temp = head;
        head = head.next;
        head.prev = null;
        return head;  
    }
    
    public Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        
        Node tail = head;
        
        while(tail.next != null) tail = tail.next;
        
        Node back = tail.prev;
        back.next = null;
        tail.prev = null;
        return head;
        
    }
    
}