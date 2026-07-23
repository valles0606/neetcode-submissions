class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode first = lists[0];
        for (int i = 1; i < lists.length; i++) {
            first = mergeTwoLists(first, lists[i]);
        }

        return first;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode solution = new ListNode();
        ListNode headSolution = solution;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                solution.next = list1;
                list1 = list1.next;
            }
            else {
                solution.next = list2;
                list2 = list2.next;
            }
            solution = solution.next;
        }
        if (list1 != null) {
            solution.next = list1;
        }
        if (list2 != null) {
            solution.next = list2;
        }
        return headSolution.next;
    }
}
