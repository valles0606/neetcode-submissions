class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (seen.contains(nums[l]) || seen.contains(nums[r])) {
                return true;
            }
            if (nums[l] == nums[r]) {
                return true;
            }
            seen.add(nums[l]);
            seen.add(nums[r]);
            l++;
            r--;
        }

        return false;
    }
}