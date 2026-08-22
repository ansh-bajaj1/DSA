class Solution {
    public int countPrimes(int n) {
        int c=0;
        int[] arr= new int[n];
        Arrays.fill(arr,1);
        for(int i=2;i<Math.sqrt(n);i++){
            if(arr[i]==1){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==1 && i<n) c++;
        } 
        return c;
    }
}