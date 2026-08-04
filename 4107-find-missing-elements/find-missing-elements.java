class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i: nums) set.add(i);
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}