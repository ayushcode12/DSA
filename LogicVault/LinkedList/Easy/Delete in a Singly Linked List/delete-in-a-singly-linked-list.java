/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head == null) return head;
        if(x == 1){
            head = head.next;
            return head;
        }
        
        int cnt = 0; 
        Node temp = head;
        Node prev = null;
        
        while(temp != null){
            cnt++;
            if(cnt == x){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        
        return head;
        
     }
}