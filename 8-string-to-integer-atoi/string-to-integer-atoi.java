class Solution {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;

    private int parse(String s, int i, long res, int sign) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int) (res * sign);
        }

        int digit = s.charAt(i) - '0';
        res = res * 10 + digit;

        if (sign * res <= INT_MIN) {
            return INT_MIN;
        }
        if (sign * res >= INT_MAX) {
            return INT_MAX;
        }

        return parse(s, i + 1, res, sign);
    }

    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) {
            return 0;
        }

        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        return parse(s, i, 0, sign);
    }
}
