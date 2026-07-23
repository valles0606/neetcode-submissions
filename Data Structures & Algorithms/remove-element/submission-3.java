class Solution {
    public int removeElement(int[] nums, int val) {
        int solIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[solIndex++] = nums[i];
            }
        }
        return solIndex;
    }
}