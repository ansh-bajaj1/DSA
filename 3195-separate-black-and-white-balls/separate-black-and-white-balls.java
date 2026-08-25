class Solution {
    public long minimumSteps(String s) {
        long a=0,c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                c++;
            }
            else{
                a+=c;
            }
        }
        return a;
    }
}