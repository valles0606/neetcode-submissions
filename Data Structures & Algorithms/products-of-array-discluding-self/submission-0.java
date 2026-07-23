
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] solution = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            int left = 0;
            int right = nums.length - 1;
            if (left != i) {
                for(int l = left; l < i; l++) {
                    prod *= nums[l];
                }
            }
            if (right != i) {
                for(int r = right; r > i; r--) {
                    prod *= nums[r];
                }
            }
            solution[i] = prod;
        }
        return solution;
    }
}  
