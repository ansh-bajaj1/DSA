class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int i=0,j=k-1,s=0;
       
        while(j<nums.length){
            if(sort(nums,i,j)){
                ans[s++]=nums[j];
            }
            else{
                ans[s++]=-1;
            }
            i++;
            j++;
        }
        return ans;
    }
    public boolean sort(int[] arr,int i,int j){
        for(int k=i;k<j;k++){
            if(arr[k]+1!=arr[k+1]) return false;
        }
        return true;
    }
}