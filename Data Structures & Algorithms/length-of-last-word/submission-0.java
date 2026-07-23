class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int ptr = s.length() - 1;
        while(s.charAt(ptr) == ' ') {
            ptr--;
        }
        for (ptr = ptr; ptr >= 0; ptr--) {
            if(s.charAt(ptr) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}