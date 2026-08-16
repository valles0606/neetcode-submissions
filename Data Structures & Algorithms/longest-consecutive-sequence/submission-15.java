class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            numbers.add(num);
        }

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.contains(nums[i] - 1)) {
                int increment = 0;
                while (numbers.contains(nums[i] + increment)) {
                    increment++;
                }
                max = Math.max(max, increment);
            }
        }
        return max;
    }
}
