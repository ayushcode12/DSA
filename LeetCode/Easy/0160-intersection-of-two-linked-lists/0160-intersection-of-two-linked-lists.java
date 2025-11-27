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
        
        Map<ListNode, Boolean> map = new HashMap<>();

        ListNode temp = headA;

        while(temp != null){
            map.put(temp, true);
            temp = temp.next;
        }

        temp = headB;

        while(temp != null){
            if(map.containsKey(temp)){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }
}