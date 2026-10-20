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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> nums = new HashSet<>();
        ListNode sol = head;
        while (head != null) {
            nums.add(head.val);
            ListNode next = head.next;
            while (next != null && nums.contains(next.val)) {
                next = next.next;
            }
            head.next = next;
            head = head.next;
        }

        return sol;
    }
}
