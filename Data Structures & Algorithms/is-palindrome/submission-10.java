class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (!isAlpha(s.charAt(l)) && l < r) {
                l++;
            }
            while (!isAlpha(s.charAt(r)) && r > l) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isAlpha(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }
}
