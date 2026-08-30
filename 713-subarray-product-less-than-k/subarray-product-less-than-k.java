class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0,i=0,j=0,p=1;
        if (k <= 1) return 0;
        while(j<nums.length){
            p*=nums[j];
            while(p>=k){
                p/=nums[i];
                i++;
            }
            if(p<k) c+=j-i+1;
            j++;
        }
        return c;
    }
}