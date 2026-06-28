class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);
        if(arr.length<=1) return 1;
        if(arr[0]!=1) arr[0]=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>1){
                arr[i]=arr[i-1]+1;
            }
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}