class Solution {
    public int minAddToMakeValid(String s) {
        int c = 0; 
        int m = 0;   

        for (char i : s.toCharArray()) {
            if (i == '(') {
                c++;
            } else { 
                if (c > 0) {
                    c--;
                } else {
                    m++;
                }
            }
        }

        return m + c;
    }
}
