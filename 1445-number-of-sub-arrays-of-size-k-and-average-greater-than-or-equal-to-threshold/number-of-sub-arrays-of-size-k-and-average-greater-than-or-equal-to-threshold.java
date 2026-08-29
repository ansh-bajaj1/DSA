class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int j=k,c=0;
        for(int i=0;i<=arr.length-k;i++){
            int s=0;
            for(int m=i;m<j;m++){
                s+=arr[m];
            }
            if(s/k>=threshold) c++;
            j++;
        }
        return c;
    }
}