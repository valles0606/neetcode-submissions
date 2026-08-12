class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        for (int i = 1; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = nums[i - 1];

            if (num1 % 2 == 0 && num2 % 2 == 0) {return false;}
            if (num1% 2 == 1 && num2 % 2 == 1) {return false;}
        }

        return true;
    }
}