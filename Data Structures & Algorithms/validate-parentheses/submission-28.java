class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> p = new HashMap<>();
        p.put('(', ')');
        p.put('{', '}');
        p.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(p.containsKey(c)) {
                stack.push(p.get(c));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (c != stack.peek()){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
