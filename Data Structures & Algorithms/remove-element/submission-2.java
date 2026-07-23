class Solution {
    public int removeElement(int[] nums, int val) {
        int solIndex = 0;
        for (int numIndex = 0; numIndex < nums.length; numIndex++) {
            if (nums[numIndex] != val) {
                nums[solIndex++] = nums[numIndex];
            }
        }
        return solIndex;
    }
}