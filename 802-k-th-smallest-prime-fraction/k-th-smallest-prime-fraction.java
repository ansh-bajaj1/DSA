class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Double> pq = new PriorityQueue<>();
        int a=-1,b=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                double d = (double)arr[i]/arr[j];
                pq.add(d);
            }
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                double s =(double) arr[i]/arr[j];
                if(s==pq.peek()){
                    a=arr[i];
                    b=arr[j];
                    break;
                }
            }
        }
        return new int[]{a,b};
    }
}