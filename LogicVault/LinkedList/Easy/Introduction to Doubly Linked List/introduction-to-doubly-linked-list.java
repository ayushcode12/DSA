// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        Node curr = head;
        
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            newNode.prev = curr;
            curr = newNode;
        }
        
        return head;
    }
}