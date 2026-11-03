class Solution {
    public int minMoves(int[] nums) {
        int max=-1,c=0;
        for(int i: nums){
            max=Math.max(max,i);
        }
        for(int i: nums){
            c+=(max-i);
        }
        return c;
    }
}