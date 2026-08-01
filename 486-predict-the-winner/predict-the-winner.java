class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length - 1) >= 0;
    }
    private int solve(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int t1 = nums[left] - solve(nums, left + 1, right);
        int t2 = nums[right] - solve(nums, left, right - 1);

        return Math.max(t1, t2);
    }
}