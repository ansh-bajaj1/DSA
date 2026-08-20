class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(l1.getLast()>l2.getLast())
            l1.add(nums[i]);
            else 
            l2.add(nums[i]);
        }
        l1.addAll(l2);
        int[] ans = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
        ans[i] = l1.get(i);
        }
    return ans;

    }
}