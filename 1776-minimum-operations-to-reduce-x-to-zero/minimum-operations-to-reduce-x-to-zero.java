class Solution {
    public int minOperations(int[] nums, int x) {
        int s=0;
        for(int i: nums){
            s+=i;
        }
        int t = s-x;
        if(t<0) return -1;
        int i=0,j=0,a=0;
        int max=Integer.MIN_VALUE;
        while(j<nums.length){
            a+=nums[j];
            while(a>t){
                a-=nums[i];
                i++;
            }
            if(a==t)
            max=Math.max(max,j-i+1);
            j++;
        }
        return max==Integer.MIN_VALUE?-1:nums.length-max;
    }
}