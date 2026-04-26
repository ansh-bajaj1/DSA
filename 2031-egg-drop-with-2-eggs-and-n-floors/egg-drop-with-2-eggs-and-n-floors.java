class Solution {
    public int twoEggDrop(int n) {
        int k = 0;
         while (k * (k + 1) / 2 < n) {
            k++;
        }
        
        return k;
    }
}