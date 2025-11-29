/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        Node temp = head;
        Node nextNode = null;
        
        while(temp != null && temp.next != null){
            nextNode = temp.next; 
            while(nextNode != null && nextNode.data == temp.data) nextNode = nextNode.next;
            temp.next = nextNode;
            if(nextNode != null) nextNode.prev = temp;
            
            temp = temp.next;
        }
        
        return head;
    }
}