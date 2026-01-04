class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            if (!map.containsKey(x)) {
                int count = 0;
                int divSum = 0;

                for (int j = 1; j * j <= x; j++) {
                    if (x % j == 0) {
                        int d1 = j;
                        int d2 = x / j;

                        if (d1 == d2) {
                            count += 1;
                            divSum += d1;
                        } else {
                            count += 2;
                            divSum += d1 + d2;
                        }
                    }
                    if (count > 4) break;
                }

                if (count == 4) map.put(x, divSum);
                else map.put(x, 0);
            }

            sum += map.get(x);
        }
        return sum;
    }
}
