class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int c=0;
        for(int i: nums){
            set.add(i);
        }
        int m=set.size();
        
        for(int i=0;i<nums.length;i++){
            Set<Integer> set2 = new HashSet<>();
            for(int j=i;j<nums.length;j++){
                    set2.add(nums[j]);
                
                if(set2.size()==m) c++;
            }
        }
        return c;
    }
}