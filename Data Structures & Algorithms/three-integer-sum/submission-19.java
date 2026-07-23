class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {continue;}
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {right--;}
                else if (nums[i] + nums[left] + nums[right] < 0) {left++;}
                else {
                    solution.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(nums[left] == nums[left - 1] && left < right) {left++;}
                    while(nums[right] == nums[right + 1] && left < right) {right--;}
                }
            }
        }
        return solution;
    }
}
