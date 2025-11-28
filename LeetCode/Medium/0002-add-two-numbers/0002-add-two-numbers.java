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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;

        while(t1 != null || t2 != null){
            int x = (t1 != null) ? t1.val : 0;
            int y = (t2 != null) ? t2.val : 0;

            int sum = x + y + carry;

            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        if(carry == 1){
            ListNode newNode = new ListNode(1);
            curr.next = newNode;
            newNode.next = null;
        }

        return dummyNode.next;

    }
}