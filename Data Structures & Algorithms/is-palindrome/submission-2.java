class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.toLowerCase();
        temp = temp.replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = temp.length() - 1;
        while(!(left > right)) {
            if (Character.toLowerCase(temp.charAt(left)) != Character.toLowerCase(temp.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
