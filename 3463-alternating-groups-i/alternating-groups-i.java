class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        if(n<3) return 0; 
        int i=0,k=1,j=2,c=0;
        while(i<n){
            if(colors[k]!=colors[i] && colors[k]!=colors[j])
            c++;
            i++;
            k=(k+1)%n;
            j=(j+1)%n;
        }
        return c;
    }
}