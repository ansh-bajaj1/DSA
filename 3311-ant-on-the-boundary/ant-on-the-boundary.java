class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int i = 0, c = 0;

        for (int n : nums) {
            i += n;
            if (i == 0) {
                c++;
            }
        }
        return c;
    }
}