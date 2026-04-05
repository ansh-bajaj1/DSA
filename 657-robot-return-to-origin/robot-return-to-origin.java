class Solution {
    public boolean judgeCircle(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U') a+=1;
            if(s.charAt(i)=='R') b+=1;
            if(s.charAt(i)=='D') a-=1;
            if(s.charAt(i)=='L') b-=1;
        }
        return a==0 && b==0;
    }
}