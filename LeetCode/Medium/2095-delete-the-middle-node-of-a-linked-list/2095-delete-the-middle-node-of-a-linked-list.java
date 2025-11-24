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
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null) return null;
        
        ListNode temp = head;
        int cnt = 0;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        int it = (int) Math.floor(cnt / 2);
        temp = head;

        while(temp != null){
            it--;
            if(it == 0) break;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;

    }
}