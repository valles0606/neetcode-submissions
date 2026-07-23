class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestSeq = 0;
        for (int num : numSet) {
            int count = 0;
            if (!numSet.contains(num - 1)) {
                int tmp = num;
                count = 1;
                while (numSet.contains(tmp + 1)) {
                    count++;
                    tmp++;
                }
                longestSeq = Math.max(longestSeq, count);
            }
        }
        return longestSeq;
    }
}