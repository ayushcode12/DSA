/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
                                                
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(head == null) return res;
        Node left = head;
        Node right = findTail(head);
        
        while(right.data > left.data){
            if(left.data + right.data == target){
                res.add(new ArrayList<>(Arrays.asList(left.data, right.data)));
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data < target){
                left = left.next;
            }
            else{
                right = right.prev;
            }
        }
        return res;
    }
    
    public static Node findTail(Node head){
        Node tail = head;
        while(tail.next != null) tail = tail.next;
        return tail;
    } 
    
}
