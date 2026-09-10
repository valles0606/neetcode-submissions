class Solution {
    public int lengthOfLastWord(String s) {
        //find where the last word ends starting from the back.
        int end = s.length() - 1;
        while (end > -1 && s.charAt(end) == ' ') {
            end--;
        }

        //start counting
        int count = 0;
        while (end > -1 && s.charAt(end) != ' ') {
            count ++;
            end--;
        }

        return count;
    }
}