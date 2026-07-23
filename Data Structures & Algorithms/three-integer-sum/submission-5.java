class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> solution = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            int a = nums[i];
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                if (a + nums[left] + nums[right] > 0) {
                    right--;
                }
                else if (a + nums[left] + nums[right] < 0) {
                    left++;
                }
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    solution.add(temp);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
            while (i < length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return solution;
    }
}
