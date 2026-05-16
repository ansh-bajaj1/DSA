class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low=0,high=nums.length-1;
        int mid=-1;
        while(low<high){
             mid = low + (high-low)/2;
            if(nums[mid]<nums[high]) high = mid;
            else if(nums[mid]>nums[high]) low=mid+1;
            else high--;
        }
        return nums[low];
    }
}