class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        String s = Integer.toBinaryString(n);
        int c=0;
        for(char i : s.toCharArray()){
            if(i=='1') c++;
        }
        return c==1?true:false;
    }
}