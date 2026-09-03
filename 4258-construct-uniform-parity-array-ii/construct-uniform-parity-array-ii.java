class Solution {
    public boolean uniformArray(int[] nums1) {
        int m=Integer.MAX_VALUE;
        for(int i: nums1){
            m=Math.min(m,i);
        }
        if(m%2==1) return true;
        for(int i: nums1){
            if(i%2==1) return false;
        }
        return true;
    }
}