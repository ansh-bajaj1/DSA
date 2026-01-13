class Solution {
    public double myPow(double x, int n) {
        double a = 1;
        long nn = n;
        if(nn<0) nn=-1*nn;
        while(nn>0){
            if(nn%2==1){
                a*=x;
                nn=nn-1;
            }
            else{
                x*=x;
                nn/=2;
            }
        }
        if(n<0) a = (double)1/a;
        return a;
    }
}