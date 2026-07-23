class Solution {
    public int[] replaceElements(int[] arr) {
        int right = arr.length;
        int max = -1;
        int[] sol = new int[right];
        for (int i = right - 1; i >= 0; i--) {
            sol[i] = max;
            max = Math.max(max, arr[i]);
        }
        return sol;
    }
}