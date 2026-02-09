class Solution {

    List<String> ans = new ArrayList<>();

    String[] map = {
        "",     
        "",   
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return ans;

        recurse(digits, 0, "");
        return ans;
    }

    private void recurse(String digits, int i, String curr) {

        if (i == digits.length()) {
            ans.add(curr);
            return;
        }

        int digit = digits.charAt(i) - '0';
        String letters = map[digit];

        for (int j = 0; j < letters.length(); j++) {
            recurse(digits, i + 1, curr + letters.charAt(j));
        }
    }
}
