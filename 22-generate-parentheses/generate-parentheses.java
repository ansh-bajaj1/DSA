class Solution {
    public List<String> generateParenthesis(int n) {
        String curr = "";
        List<String> list = new ArrayList<>();
        list = solve(curr, n);
        return list;
    }

    private List<String> solve(String curr, int n) {
        List<String> list = new ArrayList<>();

        if (curr.length() == 2 * n) {
            if (isValid(curr)) {
                list.add(curr);
            }
            return list;
        }

        list.addAll(solve(curr + "(", n));
        list.addAll(solve(curr + ")", n));

        return list;
    }

    private boolean isValid(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') c++;
            else c--;

            if (c < 0) return false;
        }
        return c == 0;
    }
}
