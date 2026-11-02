class Solution {
    public int maxArea(int[] heights) {
        int maxSol = 0;
        int l = 0, r = heights.length - 1;

        while (l < r) {
            int height = Math.min(heights[l], heights[r]);
            int width = r - l;
            maxSol = Math.max(maxSol, (height * width));
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxSol;
    }
}
