class Solution {
    public int minMoves(int[] nums) {
        int c=0;
        int min = Integer.MAX_VALUE;
        for(int i:nums){
            min = Math.min(min,i);
        }
        for(int i: nums){
            c+=(i-min);
        }
        return c;
    }
}