class Solution {
    public int appendCharacters(String s, String t) {
        int count = t.length();
        int sIndex = 0;
        int tIndex = 0;
        while (sIndex != s.length() && tIndex != t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                count--;
                tIndex++;
            }
            sIndex++;
        }
        return count;
    }
}