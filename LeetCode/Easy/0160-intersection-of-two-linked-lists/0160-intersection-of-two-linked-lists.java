/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int count1 = 0;
        int count2 = 0;

        while(temp1 != null){
            count1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            count2++;
            temp2 = temp2.next;
        }

        if(count1 < count2) return collisionPoint(headA, headB, count2-count1);
        else return collisionPoint(headB, headA, count1-count2);

    }

    public ListNode collisionPoint(ListNode temp1, ListNode temp2, int d){
        while(d != 0){
            d--;
            temp2 = temp2.next;
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

}