class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            String ss="";
            for(int j=i;j<s.length();j++){
                 ss =ss+ s.charAt(j);
                if(isPalindrome(ss)) c++;
            } 
        }
        return c;
    }
    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}