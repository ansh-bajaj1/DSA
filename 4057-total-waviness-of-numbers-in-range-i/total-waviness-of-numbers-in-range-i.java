class Solution {
    public int totalWaviness(int num1, int num2) {
        int c = 0;
        for (int j = num1; j <= num2; j++) {
            String s = String.valueOf(j);

            for (int i = 1; i < s.length() - 1; i++) {
                if ((s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1)))
                     c++;
                    if((s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1)) ){
                    c++;
                }
            }
        }

        return c;
    }
}