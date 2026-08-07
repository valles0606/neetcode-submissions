class Solution {
    public boolean validPalindrome(String s) {
        int ptr1 = 0;
        int ptr2 = s.length() - 1;
        while (ptr1 < ptr2) {
            if (s.charAt(ptr1) != s.charAt(ptr2)) {
                return isPalindrome(s.substring(0, ptr1) + s.substring(ptr1 + 1)) ||
                        isPalindrome(s.substring(0, ptr2) + s.substring(ptr2 + 1));
            }
            ptr1++;
            ptr2--;
        }
        return true;
    }

    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1; 
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}