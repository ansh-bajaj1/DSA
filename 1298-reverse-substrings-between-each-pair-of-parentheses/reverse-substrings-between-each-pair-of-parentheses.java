class Solution {
    int i = 0;
    public String reverseParentheses(String s) {
        return reverse(s);
    }

    String reverse(String s) {
        StringBuilder str = new StringBuilder();

        while (i < s.length()) {

            if (s.charAt(i) == '(') {
                i++; 

                String temp = reverse(s);
                str.append(temp);
            }
            else if (s.charAt(i) == ')') {
                i++;

                return str.reverse().toString();
            }
            else {
                str.append(s.charAt(i));
                i++;
            }
        }

        return str.toString();
    }
}