class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag=false;
        int j=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                j=i+1;
                while(j<s.length()-1){
            if(s.charAt(j)=='0' && s.charAt(j+1)=='1'){
                return false;
            }
            j++;
                }
        }
        }
        return true;
        
    }
}