class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int max = 0;
        for (int num : nums) {
            if(!numSet.contains(num - 1)) {
                int count = 1;
                while (numSet.contains(num + 1)) {
                    count++;
                    num++;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }
}