class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int i=0,j=n-1;
        int max=0;
        while(i<j){
            if(colors[i]!=colors[j])max= Math.max(max,Math.abs(i-j));
            j--;
        }
        j=n-1;
        while(i<j){
            if(colors[i]!=colors[j]) max= Math.max(max,Math.abs(i-j));
            i++;
        }
        return max;
    }
}