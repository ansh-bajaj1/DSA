class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr =  new int[2*nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            arr[j]=nums[nums.length-i-1];
            j++;
        }
        return arr;
    }
}