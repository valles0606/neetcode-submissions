class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> brackets = new Stack<>();
        for (int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                switch (s.charAt(i)) {
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
            else if (s.charAt(i) != brackets.peek()) {
                return false;
            }
            else {
                brackets.pop();
            }
        }
        if (!brackets.isEmpty()) {
            return false;
        }
        return true;
    }
}
