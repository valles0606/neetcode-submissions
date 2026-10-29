class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> p = new HashMap<>();
        p.put('[', ']');
        p.put('(', ')');
        p.put('{', '}');

        Stack<Character> orderOfClosed = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (p.containsKey(c)) {
                orderOfClosed.push(p.get(c));
            } else if (!orderOfClosed.isEmpty() && orderOfClosed.peek() == c) {
                orderOfClosed.pop();
            } else {
                return false;
            }
        }

        return orderOfClosed.isEmpty();
    }
}
