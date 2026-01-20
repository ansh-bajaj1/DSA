class Solution {
    public int scoreOfParentheses(String s) {
        int a = 0;
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                d++;
            } else {
                d--;
                if (s.charAt(i - 1) == '(') {
                    int val = 1;
                    for (int j = 0; j < d; j++) {
                        val *= 2;
                    }
                    a += val;
                }
            }
        }
        return a;
    }
}
