class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (index.containsKey(n)) {
                return new int[]{index.get(n), i};
            }
            index.put(nums[i], i);
        }

        return new int[]{};
    }
}
