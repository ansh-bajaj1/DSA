class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i=='(' || i=='{' || i=='['){
                st.push(i);
            }
            else{
                    if(st.isEmpty())
                    return false;
                    char top = st.pop();
                    if(top=='(' && i!=')'||top=='{' && i!='}'|| top=='[' && i!=']'){
                        return false;
                    }
                
                
            }
        }
        return st.isEmpty();
    }
}