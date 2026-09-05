class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int[] arr = new int[nums.length];
        int a=-1;
        arr[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            arr[i] = Math.min(nums[i], arr[i + 1]);
        }   

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            
            if(max-arr[i]<=k){
            a=i;
            break;
            }
        }
        return a;
    }
}