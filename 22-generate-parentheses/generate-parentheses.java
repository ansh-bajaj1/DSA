class Solution {
    public List<String> generateParenthesis(int n) {
        String curr = "";
        int open=0,close=0;
        List<String> list = new ArrayList<>();
        list = solve(curr, n,open,close);
        return list;
    }

    private List<String> solve(String curr, int n,int open,int close) {
        List<String> list = new ArrayList<>();

        if (curr.length() == 2 * n) {
            list.add(curr);
            return list;
        }

        if(open<n){
        list.addAll(solve(curr + "(", n,open+1,close));
        }
        if(close<open){
        list.addAll(solve(curr + ")", n,open,close+1));
        }

        return list;
    }

    
}
