class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        int x=k;
        for(int i=1;i<=100;i++){
            if(!set.contains(x)){
                return x;
            }
            x+=k;
        }
        return 101;
    }
}