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
        ListNode sol = new ListNode();
        ListNode head = sol;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                sol.next = list1;
                list1 = list1.next;
            } else {
                sol.next = list2;
                list2 = list2.next;
            }
            sol = sol.next;
        }
        if (list1 != null) {
            sol.next = list1;
        }
        if (list2 != null) {
            sol.next = list2;
        }
        return head.next;
    }
}