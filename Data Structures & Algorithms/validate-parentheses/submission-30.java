class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> par = new HashMap<>();
        par.put('[' , ']');
        par.put('(' , ')');
        par.put('{' , '}');

        Stack<Character> stringStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (par.containsKey(c)) {
                stringStack.push(par.get(c));
            } else if (!stringStack.isEmpty() && stringStack.peek() == c) {
                stringStack.pop();
            } else {
                return false;
            }
        }

        return stringStack.isEmpty();
    }
}

//time complexity: O(n)
//space complexity: O(n)
