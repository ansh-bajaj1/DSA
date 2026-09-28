class Solution {
    public int maxDepth(String s) {
        int max=0,c=0;
        for(char i:s.toCharArray()){
            if(i=='(') {
                c++;
                max=Math.max(max,c);
            }
            else if(i==')') c--;

        }
        return max;
    }
}