class Solution {
    public long countSubarrays(int[] nums, int k) {
        int m=-1;
        for(int i: nums){
            m=Math.max(m,i);
        }
        int i=0,j=0,c=0;
        long a=0;
        while(j<nums.length){
            if(nums[j]==m) c++;
            while(c>=k){
                if(nums[i]==m) c--;
                i++;
            }
            a+=i;
            j++;
        }
        return a;
    }
}