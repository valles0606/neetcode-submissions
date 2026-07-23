class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] stringArray1 = s.toCharArray(); 
        Arrays.sort(stringArray1);
        char[] stringArray2 = t.toCharArray(); 
        Arrays.sort(stringArray2);
        return Arrays.equals(stringArray1, stringArray2);
    }
}
