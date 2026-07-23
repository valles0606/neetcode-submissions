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
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head.next;
        while (slowPtr != null && fastPtr != null) {
            if (slowPtr == fastPtr) {
                return true;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
            if (fastPtr != null) {fastPtr = fastPtr.next;}
        }
        return false;
    }
}
