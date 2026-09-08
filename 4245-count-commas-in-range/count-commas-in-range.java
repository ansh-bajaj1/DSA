class Solution {
    public int countCommas(int n) {
        int c = 0;
        long base = 1000;
        while (n >= base) {
            c += (n - base + 1);
            base *= 1000;
        }
        
        return c;
    }
}