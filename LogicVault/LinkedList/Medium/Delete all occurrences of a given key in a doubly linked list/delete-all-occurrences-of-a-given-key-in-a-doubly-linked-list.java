// User function Template for Java

/* Structure of Doubly Linked List
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
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head; 
        while(temp != null){
            if(temp.data == x){
                
                Node nextNode = temp.next;
                Node prevNode = temp.prev;
                
                if(temp == head){
                    head = nextNode;
                }
                
                if(prevNode != null) prevNode.next = nextNode;
                if(nextNode != null) nextNode.prev = prevNode;
                
                temp = nextNode;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}