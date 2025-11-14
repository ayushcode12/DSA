/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        if(head == null){
            if(pos == 1) return new Node(val);
        } 
        
        if(pos == 1){
            Node temp = new Node(val);
            temp.next = head;
            return temp;
        }
        
        int cnt = 0;
        Node temp = head;
        
        while(temp != null){
            cnt++;
            
            if(cnt == pos - 1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            
            temp = temp.next;
        }
        
        return head;
    }
}