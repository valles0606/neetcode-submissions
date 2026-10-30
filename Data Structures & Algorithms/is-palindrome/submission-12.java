class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; 
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isValidChar(s.charAt(left))) {
                left++;
            }
            while (left < right && !isValidChar(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isValidChar(char c) {
        if (c <= 'Z' && c >= 'A') {
            return true;
        }
        if (c <= 'z' && c >= 'a') {
            return true;
        }
        if (c <= '9' && c >= '0') {
            return true;
        }
        return false;
    }
}
