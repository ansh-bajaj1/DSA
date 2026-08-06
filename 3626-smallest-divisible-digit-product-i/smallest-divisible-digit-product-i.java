class Solution {
    public int smallestNumber(int n, int t) {
        int i=n;
        int ans=0;
        boolean f =false;
        while(f!=true){
            int p=i;
            int a=1;
            while(p>0){
            int r = p%10;
            a*=r;
            p/=10;
            }
            if(a%t==0){
             f = true;
             ans=i;
            }
            i++;
        }
        return ans;
    }
}