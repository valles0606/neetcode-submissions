class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] > 0) {right--;}
                else if (nums[i] + nums[left] + nums[right] < 0) {left++;}
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    solution.add(temp);
                    left++;
                    right--;
                    while(nums[left] == nums[left - 1] && left < right) {left++;}
                    while(nums[right] == nums[right + 1] && left < right) {right--;}
                }
            }
            while(i < nums.length - 2 && nums[i] == nums[i + 1]) {i++;}
        }
        return solution;
    }
}
