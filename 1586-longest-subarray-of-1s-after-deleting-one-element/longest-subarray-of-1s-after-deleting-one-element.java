class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int c = 0;
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] == 0) {
                c++;
            }

            while (c > 1) {
                if (nums[l] == 0) {
                    c--;
                }
                l++;
            }

            ans = Math.max(ans, r - l);
        }

        return ans;
    }
}