class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
            for(int i=0;i<nums.size();i++){
            int s =0;
            for(int j= i;j<nums.size();j++){
                s+=nums.get(j);
                if(s>0 && (j-i+1 >=l && j-i+1<=r)){
                    min=Math.min(min,s);
                }
            }
        }
        return min == Integer.MAX_VALUE ?-1 :min;
    }
}