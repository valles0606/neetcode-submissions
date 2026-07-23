class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preFix = new int[nums.length];
        int[] postFix = new int[nums.length];
        for (int i = 0; i < preFix.length; i++) {
            if (i == 0) {
                preFix[i] = nums[i];
            }
            else {
                preFix[i] = preFix[i - 1] * nums[i];
            }
        }
        for (int i = postFix.length - 1; i >= 0; i--) {
            if (i == postFix.length - 1) {
                postFix[i] = nums[i];
            }
            else {
                postFix[i] = postFix[i + 1] * nums[i];
            }
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++) {
            if (i == 0) {
                output[i] = postFix[i + 1];
            }
            else if (i == nums.length - 1) {
                output[i] = preFix[i - 1];
            }
            else {
                output[i] = preFix[i - 1] * postFix[i + 1];
            }
        }
        return output;
    }
}  
