class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (indices.containsKey(tmp)) {
                return new int[] {indices.get(tmp), i};
            } 
            indices.put(nums[i], i);
        }

        return new int[]{};
    }
}
