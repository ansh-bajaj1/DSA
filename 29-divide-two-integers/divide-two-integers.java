class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        boolean s = false;
        if(dividend<=0 && divisor>0) s = true;
        if(dividend>0 && divisor<0) s = true;
        long ans=0;
        while(a>=b){
            int c=0;
            while(c<30 && a>=(b<<(c+1))){
                c++;
            }
            ans+=(1<<c);
            a-=(b<<c);
        }

        if(s) ans = -ans;

        if(ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) ans;

    }
}