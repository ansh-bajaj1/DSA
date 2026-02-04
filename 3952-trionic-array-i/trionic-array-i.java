class Solution {
    private boolean increasing(int[] nums, int s, int e) {
        for (int i = s; i < e; i++) {
            if (nums[i] >= nums[i + 1])
                return false;
        }
        return true;
    }

    private boolean decreasing(int[] nums, int s, int e) {
        for (int i = s; i < e; i++) {
            if (nums[i] <= nums[i + 1])
                return false;
        }
        return true;
    }

    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        for (int p = 1; p < n - 2; p++) {
        for (int q = p + 1; q < n - 1; q++) {
            if (increasing(nums, 0, p) &&
                decreasing(nums, p, q) &&
                increasing(nums, q, n - 1)) {
                return true;
            }
        }
    }
    return false;
}
}