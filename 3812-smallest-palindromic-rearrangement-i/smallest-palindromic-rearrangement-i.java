class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        String a =s.substring(0, n / 2);
        char[] c = a.toCharArray();

        Arrays.sort(c);

        char[] ans = new char[n];

        for (int i = 0; i < n / 2; i++) {
            ans[i] = c[i];
            ans[n - 1 - i] = c[i];
        }
         if (n % 2 == 1) {
            ans[n / 2] = s.charAt(n / 2);
        }
        return new String(ans);
    }
}