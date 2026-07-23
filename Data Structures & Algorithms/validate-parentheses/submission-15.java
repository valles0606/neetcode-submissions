class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> brackets = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                switch (c) {
                    case '(': 
                        brackets.push(')');
                        break;
                    case '[':
                        brackets.push(']');
                        break;
                    case '{':
                        brackets.push('}');
                }
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
