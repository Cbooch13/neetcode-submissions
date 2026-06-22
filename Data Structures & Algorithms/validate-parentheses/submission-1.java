class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (map.containsKey(bracket)) {
                if (!stack.isEmpty() && stack.peek() == map.get(bracket)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(bracket);
            }
        }

        return stack.isEmpty();
    }
}
