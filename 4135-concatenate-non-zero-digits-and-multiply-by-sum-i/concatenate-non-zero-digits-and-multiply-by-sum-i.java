class Solution {
    public long sumAndMultiply(int n) {
        String s = "";
        String a = String.valueOf(n);
        for (char i : a.toCharArray()) {
            if (i != '0') {
                s += i;
            }
        }
        if (s.isEmpty()) {
        return 0;
        }
        int p = Integer.parseInt(s);

        int sum = 0;
        for (char i : s.toCharArray()) {
            sum += i - '0';
        }

        return (long) sum * p;
    }
}