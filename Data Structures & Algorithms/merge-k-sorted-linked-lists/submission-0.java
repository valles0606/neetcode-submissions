class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Handle edge case: empty input array
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        // Start with the first list
        ListNode result = lists[0];
        
        // Merge the accumulated result with the next list, one by one
        for (int i = 1; i < lists.length; i++) {
            result = mergeTwoLists(result, lists[i]);
        }
        
        return result;
    }

    // Your perfectly written helper method!
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode solution = new ListNode();
        ListNode headSolution = solution;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                solution.next = list1;
                list1 = list1.next;
            } else {
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
