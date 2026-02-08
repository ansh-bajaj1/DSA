class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        recurse(k,n,new ArrayList<>(),0,1);
        return ans;
    }
    private void recurse(int k, int n, List<Integer> list,int sum, int i){
        if(sum>n) return;
        if(k==0){
            if(sum==n){
                ans.add(new ArrayList<>(list));
                return;
            }
            return;
        }
        if(i>9) return;
        sum+=i;
        list.add(i);
        recurse(k-1,n,list,sum,i+1);
        sum-=i;
        list.remove(list.size()-1);
        recurse(k,n,list,sum,i+1);
    }
}