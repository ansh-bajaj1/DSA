class Solution {
    public boolean checkString(String s) {
        int j=0;
        for(char i :s.toCharArray()){
            if(i=='b') break;
            j++;
        }
        while(j<s.length()){
            if(s.charAt(j)=='a') return false;
            j++;
        }
        return true;
    }
}