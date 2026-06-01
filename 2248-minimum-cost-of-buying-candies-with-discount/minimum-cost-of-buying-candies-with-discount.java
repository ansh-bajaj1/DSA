class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int s = 0;
        int i = cost.length - 1;

        for (; i >= 2; i -= 3) {
            s += cost[i] + cost[i - 1];
        }
        while (i >= 0) {
            s += cost[i];
            i--;
        }

        return s;
    }
}