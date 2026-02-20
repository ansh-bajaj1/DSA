class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
             List<Long> ans = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return ans;
        }
        long i = 2;
        while (i <= finalSum) {
            ans.add(i);
            finalSum -= i;
            i += 2;
        } 
        ans.add(finalSum  + ans.remove(ans.size() - 1));
        return ans;
    }
}