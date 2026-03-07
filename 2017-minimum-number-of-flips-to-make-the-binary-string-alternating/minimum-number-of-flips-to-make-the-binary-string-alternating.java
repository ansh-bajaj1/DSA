class Solution {
    public int minFlips(String s) {

        int n = s.length();
        String ss = s + s;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int i = 0; i < ss.length(); i++){
            if(i % 2 == 0){
                s1.append('0');
                s2.append('1');
            } 
            else {
                s1.append('1');
                s2.append('0');
            }
        }

        int i = 0;
        int f1 = 0, f2 = 0;
        int min = Integer.MAX_VALUE;

        for(int j = 0; j < ss.length(); j++){
            if(ss.charAt(j) != s1.charAt(j)) f1++;
            if(ss.charAt(j) != s2.charAt(j)) f2++;
            if(j - i + 1 > n){
                if(ss.charAt(i) != s1.charAt(i)) f1--;
                if(ss.charAt(i) != s2.charAt(i)) f2--;
                i++;
            }

            if(j - i + 1 == n){
                min = Math.min(min, Math.min(f1, f2));
            }
        }

        return min;
    }
}