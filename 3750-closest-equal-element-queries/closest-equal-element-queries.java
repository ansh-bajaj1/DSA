class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (List<Integer> list : map.values()) {
            int size = list.size();
            if (size == 1) continue;

            for (int i = 0; i < size; i++) {
                int curr = list.get(i);
                int next = list.get((i + 1) % size);

                int dist = Math.min(Math.abs(curr - next), n - Math.abs(curr - next));
                if (ans[curr] == -1 || ans[curr] > dist)
                    ans[curr] = dist;

                if (ans[next] == -1 || ans[next] > dist)
                    ans[next] = dist;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int q : queries) {
            res.add(ans[q]);
        }

        return res;
    }
}