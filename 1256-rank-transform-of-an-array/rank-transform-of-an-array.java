class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, rank++);
            }
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}