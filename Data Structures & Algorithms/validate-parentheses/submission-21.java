class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> check = new HashMap<>();
        check.put('(', ')');
        check.put('[', ']');
        check.put('{', '}');
        for (char c : s.toCharArray()) {
            if (check.containsKey(c)) {
                stack.push(check.get(c));
            }
            else if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
