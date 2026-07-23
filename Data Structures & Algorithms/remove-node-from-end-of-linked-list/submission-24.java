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

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = head;
        while(n > 0) {
            end = end.next;
            n--;
        }
        while(end != null) {
            start = start.next;
            end = end.next;
        }
        start.next = start.next.next;
        return dummy.next;

    }
}