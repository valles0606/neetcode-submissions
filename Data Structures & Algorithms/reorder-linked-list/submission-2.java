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
    public void reorderList(ListNode head) {
        ListNode mid = head;
        ListNode tail = head;

        //find the middle and end
        while (tail != null && tail.next != null) {
            mid = mid.next;
            tail = tail.next.next;
        }

        //reverse 2nd half;
        ListNode prev = null;
        while (mid != null) {
            ListNode curr = mid.next;
            mid.next = prev;
            prev = mid;
            mid = curr;
        }

        //merge both lists
        ListNode list1 = head;
        ListNode list2 = prev;

        while (list1 != null && list2.next != null) {
            ListNode tmp1 = list1.next;
            ListNode tmp2 = list2.next;

            list1.next = list2;
            list1 = tmp1;
            list2.next = list1;
            list2 = tmp2;
        }
    }
}
