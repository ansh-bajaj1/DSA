class Solution {
    public int gcdOfOddEvenSums(int n) {
        int s1=n*n;
        int s2=n*(n+1);
        while(s2!=0){
            int t = s2;
            s2=s1%s2;
            s1=t;
        }
        return s1;
    }
}