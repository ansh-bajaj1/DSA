import java.util.Stack;

class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        int n = part.length();

        for (char c : s.toCharArray()) {
            stack.push(c);

            if (stack.size() >= n) {
                boolean m = true;
                char[] temp = new char[n];

                for (int i = n - 1; i >= 0; i--) {
                    temp[i] = stack.pop();
                    if (temp[i] != part.charAt(i)) {
                        m = false;
                    }
                }

                if (!m) {
                    for (int i = 0; i < n; i++) {
                        stack.push(temp[i]);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
