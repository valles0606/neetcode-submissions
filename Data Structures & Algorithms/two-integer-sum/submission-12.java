public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numsMap.containsKey(diff) && numsMap.get(diff) != i) {
                return new int[]{i, numsMap.get(diff)}; //returning a new array with the index of the first num we tested
                //and the difference index
            }
        }
        return new int[0]; //returning an empty array of size 0;
    }
}