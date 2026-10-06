class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            int[] keyCount = new int[26];
            for (int i = 0; i < str.length(); i++) {
                keyCount[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(keyCount);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
