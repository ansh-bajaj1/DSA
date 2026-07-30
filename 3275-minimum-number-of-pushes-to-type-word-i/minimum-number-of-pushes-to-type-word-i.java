class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int a=0;
        if(n<=8)
         a=n;
        else if (n<=16)
        a=8+(n-8)*2;
        else if (n<=24)
        a=24+(n-16)*3;
        else a=48+(n-24)*4;
        return a;
    }
}