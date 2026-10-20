class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int k = 0; k < 9; k++) {
                char ch = board[i][k];
                if (ch != '.') {
                if (set.contains(ch)) return false;
                set.add(ch);
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int k = 0; k < 9; k++) {
                char ch = board[k][i];
                if (ch != '.') {
                    if (set.contains(ch)) return false;
                    set.add(ch);
                }
            }
        }

        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int k = 0; k < 3; k++) {
                        char ch = board[r + i][c + k];
                        if (ch != '.') {
                        if (set.contains(ch)) return false;
                        set.add(ch);
                        }
                    }
                }
            }
        }
        return true;
    }
}