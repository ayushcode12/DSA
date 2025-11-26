/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        Node temp = head;
        
        while(temp != null){
            
            if(temp.data == 0) count0++;
            else if(temp.data == 1) count1++;
            else count2++;
            
            temp = temp.next;
        }
        
        temp = head;
        
        while(temp != null){
            
            if(count0 != 0){
                count0--;
                temp.data = 0;
            }
            else if(count1 != 0){
                count1--;
                temp.data = 1;
            }
            else{
                count2--;
                temp.data = 2;
            }
            
            temp = temp.next;
            
        }
        
        return head;
        
    }
}