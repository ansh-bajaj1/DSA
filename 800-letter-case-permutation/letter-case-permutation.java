class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        permutation(s, 0, "");
        return ans;
    }

    void permutation(String s, int idx, String str) {
        if (idx == s.length()) {
            ans.add(str);
            return;
        }

        char ch = s.charAt(idx);

        if (Character.isDigit(ch)) {
            permutation(s, idx + 1, str + ch);
        } else {
            permutation(s, idx + 1, str + Character.toLowerCase(ch));
            permutation(s, idx + 1, str + Character.toUpperCase(ch));
        }
    }
}