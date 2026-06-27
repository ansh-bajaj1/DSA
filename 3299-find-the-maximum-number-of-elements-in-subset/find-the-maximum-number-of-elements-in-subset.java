class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (int start : map.keySet()) {
            int a = 0;
            int curr = start;
            if (start == 1) {
                int f = map.get(1);
                max = Math.max(max, (f % 2 == 0) ? f - 1 : f);
                continue;
            }
            while (map.containsKey(curr)) {
                if (map.get(curr) >= 2) {
                    a += 2;
                } else {
                    a++;
                    break;
                }

                curr = curr * curr;
                if (!map.containsKey(curr)) {
                    a--;
                    break;
                }
            }

            max = Math.max(max, a);
        }
        return max;
    }
}