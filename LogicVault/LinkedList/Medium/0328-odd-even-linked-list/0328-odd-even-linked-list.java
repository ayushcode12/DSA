/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;
        
        Queue<Integer> q = new LinkedList<>();

        ListNode temp = head;

        while(temp != null){
            q.add(temp.val);
            if(temp.next == null) break;
            temp = temp.next.next;
        }

        temp = head.next;

        while(temp != null){
            q.add(temp.val);
            if(temp.next == null) break;
            temp = temp.next.next;
        }

        temp = head;

        while(temp != null){
            temp.val = q.poll();
            temp = temp.next;
        }

        return head;

    }
}