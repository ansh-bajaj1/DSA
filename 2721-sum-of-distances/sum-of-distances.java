class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> l : m.values()) {
            int sz = l.size();

            long s = 0; 
            for (int x : l) {
                s += x;
            }
            long sl = 0; 
            int c = 0;   

            for (int i = 0; i < sz; i++) {
                int idx = l.get(i);

                long left = (long) c * idx - sl;
                long right = (s - sl - idx) - (long)(sz - c - 1) * idx;

                res[idx] = left + right;

                sl += idx;
                c++;
            }
        }

        return res;
    }
}