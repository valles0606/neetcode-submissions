class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 97]++;
            tArray[t.charAt(i) - 97]++;
        }
        return Arrays.equals(sArray, tArray);
    }
}
