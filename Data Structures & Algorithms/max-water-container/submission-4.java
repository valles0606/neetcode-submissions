class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = -1;
        while (l < r) {
            int x = r - l;
            int y = Math.min(heights[l], heights[r]);
            int sol = x * y;
            max = Math.max(max, sol);
            if (heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return max;
    }
}
