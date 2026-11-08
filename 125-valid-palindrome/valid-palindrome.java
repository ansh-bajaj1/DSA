class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        String ss = s.toLowerCase();
        while(i<j){
            if(!Character.isLetterOrDigit(ss.charAt(i))){
            i++;
            continue;
            }
            else if(!Character.isLetterOrDigit(ss.charAt(j))){
            j--;
            continue;
            }
            if(ss.charAt(i)!=ss.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}