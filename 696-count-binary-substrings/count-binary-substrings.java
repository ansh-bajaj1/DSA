class Solution {
    public int countBinarySubstrings(String s) {
        int c = 1, prev = 0, res = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                c++;              
            } else {
                prev = c;         
                c = 1;           
            }

            if (c <= prev)
                res++;
        }

        return res;
    }
}
