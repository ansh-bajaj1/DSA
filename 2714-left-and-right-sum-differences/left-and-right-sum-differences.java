class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            left[i] = call(i,nums);
            right[i] = calr(i,nums);
            ans[i] = Math.abs(left[i]-right[i]);
        }
        return ans;
    }
    private int call(int j, int[] nums){
        int s=0;
        int n = nums.length;
        for(int i=0;i<j;i++){
            s+=nums[i];
        }
        return s;
    }
    private int calr(int j, int[] nums){
        int s=0;
        int n = nums.length;
        for(int i=j+1;i<n;i++){
            s+=nums[i];
        }
        return s;
    }
}