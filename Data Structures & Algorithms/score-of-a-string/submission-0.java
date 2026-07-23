class Solution {
    public int scoreOfString(String s) {
        int right = s.length() - 1;
        int left = right - 1;
        int score = 0;
        while (left >= 0) {
            score += Math.abs(s.charAt(right) - s.charAt(left));
            left--;
            right--;
        }
        return score;
    }
}