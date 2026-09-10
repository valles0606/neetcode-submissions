class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < s.length() && !isAlphaNum(s.charAt(left))) {
                left++;
            }

            while (right > -1 && !isAlphaNum(s.charAt(right))) {
                right--;
            }
            
            if (left > right) {
                break;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphaNum(char c) {
        if (c >= 'A' && c <= 'Z') {return true;}
        if (c >= 'a' && c <= 'z') {return true;}
        if (c >= '0' && c <= '9') {return true;}

        return false;
    }
}
