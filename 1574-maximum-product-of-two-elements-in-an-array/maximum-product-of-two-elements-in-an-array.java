class Solution {
    public int maxProduct(int[] nums) {
        int m1=0,m2=0;
        for(int i:nums){
            if(i>m1){
                m2=m1;
                m1=i;
            }
            else if(i>m2) m2=i;
        }
        return (m1-1)*(m2-1);
    }
}