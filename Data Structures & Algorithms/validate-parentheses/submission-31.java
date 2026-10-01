class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> par = new HashMap<>();
        Stack<Character> charStack = new Stack<>();
        par.put('(', ')');
        par.put('[', ']');
        par.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (par.containsKey(tmp)) {
                charStack.push(par.get(tmp));
            } else if (charStack.isEmpty() || charStack.peek() != tmp) {
                return false;
            } else {
                charStack.pop();
            }
        }

        return charStack.isEmpty();
    }
}
