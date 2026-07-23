class Solution {
    public int[] sortArray(int[] nums) {
        int length = nums.length;

        if (length < 2) {
            return nums;
        }

        int midIndex = length / 2;
        int[] left = new int[midIndex];
        int[] right = new int[length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            left[i] = nums[i];
        }
        for (int i = midIndex; i < length; i++) {
            right[i - midIndex] = nums[i];
        }

        sortArray(left);
        sortArray(right);
        merge(nums, left, right);
        return nums;
    }

    private static void merge(int[] inputArray, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                inputArray[k] = left[i];
                i++;
            } else {
                inputArray[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = right[j];
            j++;
            k++;
        }
    }
}