class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)!='*' && s.charAt(i)!='#' && s.charAt(i)!='%'){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*' && sb.length()>0){
                
                sb.deleteCharAt(sb.length() - 1);
            }
            else if(s.charAt(i)=='#'){
                sb.append(sb);
            }
            else if(s.charAt(i)=='%'){
                sb.reverse();
            }
            i++;
        }
        return sb.toString();
    }
}