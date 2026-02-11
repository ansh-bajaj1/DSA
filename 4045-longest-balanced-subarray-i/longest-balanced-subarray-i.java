class Solution {
    public int longestBalanced(int[] nums) {
        int c = 0, j = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> s1 = new HashSet<>();
            Set<Integer> s2 = new HashSet<>();
            for (j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0)
                    s1.add(nums[j]);
                else
                    s2.add(nums[j]);
                if (s1.size() == s2.size()) {
                    max = Math.max(max, j - i + 1);
                }
            }

        }
        return max;
    }
}