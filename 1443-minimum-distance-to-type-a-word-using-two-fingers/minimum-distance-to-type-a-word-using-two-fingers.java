class Solution {
    public int minimumDistance(String word) {
        Integer[][][][][] dp = new Integer[301][7][7][7][7];
        return solve(word,0,-1,-1,-1,-1,dp);
    }

    private int solve(String word,int i,int x1,int y1,int x2,int y2,Integer[][][][][] dp) {
        if (i >= word.length()) return 0;

        int dx1 = x1 + 1, dy1 = y1 + 1;
        int dx2 = x2 + 1, dy2 = y2 + 1;

        if (dp[i][dx1][dy1][dx2][dy2] != null)
            return dp[i][dx1][dy1][dx2][dy2];

        Pair<Integer, Integer> p = get(word.charAt(i));
        int x = p.getKey();
        int y = p.getValue();

        int ans;

        if (x1 == -1 && y1 == -1 && x2 == -1 && y2 == -1) {
            int f1 = solve(word, i + 1, x, y, x2, y2, dp);
            int f2 = solve(word, i + 1, x1, y1, x, y, dp);
            ans = Math.min(f1, f2);
        }
         if (x2 == -1 && y2 == -1) {
            int f2 = solve(word, i + 1, x1, y1, x, y, dp);
            int f1 = dist(x1, y1, x, y)+solve(word, i + 1, x, y, x2, y2, dp);

            ans = Math.min(f1, f2);
        }
            int f1 = dist(x1, y1, x, y) +solve(word, i + 1, x, y, x2, y2, dp);
            int f2 = dist(x2, y2, x, y) +solve(word, i + 1, x1, y1, x, y, dp);

            ans = Math.min(f1, f2);
        
        return dp[i][dx1][dy1][dx2][dy2] = ans;
    }

    private int dist(int x1, int y1, int x2, int y2) {
        if (x1 == -1) return 0;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    private Pair<Integer, Integer> get(char ch) {
        int curr = ch - 'A';
        return new Pair<>(curr / 6, curr % 6);
    }
}