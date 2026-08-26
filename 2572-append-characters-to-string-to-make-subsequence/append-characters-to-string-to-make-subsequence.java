class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        while(j<t.length() && i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length()-j;
    }
}