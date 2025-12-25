import java.util.*;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness); 

        long sum = 0;
        int n = happiness.length;

        for (int i = 0; i < k; i++) {
            int a = happiness[n - 1 - i] - i;
            if (a <= 0) break;
            sum += a;
        }
        return sum;
    }
}