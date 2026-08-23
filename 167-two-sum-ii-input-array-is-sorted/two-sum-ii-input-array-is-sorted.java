class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int[]a = new int[2];
        while(i<numbers.length && j>=0){
            int s=numbers[i]+numbers[j];
             if(s==target){
                a[0]=i+1;
                a[1]=j+1;
                break;
            }
            if(s>target){
                j--;
            }
            else{
                i++;
            }
           
            
        }
        return a;
    }
}