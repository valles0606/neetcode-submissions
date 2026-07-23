class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] temp = new char[26];
            for (char c : s.toCharArray()) {
                temp[c - 'a'] += 1;
            }
            String key = Arrays.toString(temp);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
