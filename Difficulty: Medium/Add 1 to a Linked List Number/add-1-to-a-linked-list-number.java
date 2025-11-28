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
    public Node addOne(Node head) {
        int carry = helper(head);
        if(carry == 1){
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
    
    public int helper(Node temp){
        if(temp == null) return 1;
        int carry = helper(temp.next);
        temp.data = temp.data + carry;
        if(temp.data < 10){
            return 0;
        }
        temp.data = 0;
        return 1;
    }
    
}