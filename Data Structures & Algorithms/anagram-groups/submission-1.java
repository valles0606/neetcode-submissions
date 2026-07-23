class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();
        for (String s : strs) {
            char[] charKey = new char[26];
            for (char c : s.toCharArray()) {
                charKey[c - 'a']++;
            }
            String key = Arrays.toString(charKey);
            grouped.putIfAbsent(key, new ArrayList<String>());
            grouped.get(key).add(s);
        }
        return new ArrayList<>(grouped.values());
    }
}
