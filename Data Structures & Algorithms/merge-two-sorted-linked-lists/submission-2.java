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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headSol = new ListNode();
        ListNode solNext = headSol;

        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while (ptr1 != null && ptr2!= null) {
            if (ptr1.val < ptr2.val) {
                solNext.next = ptr1;  // point directly to existing node
                ptr1 = ptr1.next;
            } else {
                solNext.next = ptr2;  // point directly to existing node
                ptr2 = ptr2.next;
            }
            solNext = solNext.next;   // always advance after each assignment
        }

        if (ptr1 != null) {
            solNext.next = ptr1;
        }
        if (ptr2 != null) {
            solNext.next = ptr2;
        }

        return headSol.next;
    }
}