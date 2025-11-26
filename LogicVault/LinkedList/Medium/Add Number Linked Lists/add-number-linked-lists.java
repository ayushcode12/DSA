/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        // code here
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry = 0;
        
        while(t1 != null || t2 != null){
            int sum = carry;
            
            if(t1 != null) sum += t1.data;
            if(t2 != null) sum += t2.data;
            
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            
            curr.next = newNode;
            curr = curr.next;
            
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        
        if(carry != 0){
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        
        Node result = reverse(dummy.next);
        
        while (result != null && result.data == 0 && result.next != null) {
            result = result.next;
        }
        
        return result;
        
    }
    
    private Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
    
}