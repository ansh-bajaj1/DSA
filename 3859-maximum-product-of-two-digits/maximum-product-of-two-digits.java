class Solution {
    public int maxProduct(int n) {
        int m = 0, m1 = 0;
        while (n != 0) {
        int r = n % 10;
        if (r >= m) {
            m1 = m;
            m = r;
        } 
        else if (r > m1) {
            m1 = r;
        }
            n /= 10;
        }
        return m1 * m;
    }
}