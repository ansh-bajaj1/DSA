class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int rev = rev(nums[i]);
            if(map.containsKey(nums[i])) {
            min = Math.min(min,Math.abs(i-map.get(nums[i])));
            }
            map.put(rev,i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    private int rev(int num){
        int rev=0;
        while(num>0){
            int r = num%10;
             rev = rev*10+r;
            num/=10;
        }
        return rev;
    }
}