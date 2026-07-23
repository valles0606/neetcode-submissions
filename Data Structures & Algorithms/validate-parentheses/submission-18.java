class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                brackets.push(map.get(c));
            }
            else if (brackets.isEmpty()) {
                return false;
            }
            else if (c != brackets.peek()) {
                return false;
            }
            else {
                brackets.pop();
            }
        }
        return brackets.isEmpty();
    }
}
