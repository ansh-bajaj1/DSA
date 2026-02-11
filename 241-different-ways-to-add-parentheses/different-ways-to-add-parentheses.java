class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        return recurse(expression);
    }

    private List<Integer> recurse(String s){
        List<Integer> ans = new ArrayList<>(); 

        if (!s.contains("+") && !s.contains("-") && !s.contains("*")) {
            ans.add(Integer.parseInt(s));
            return ans;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='+' || ch=='-' || ch=='*'){

                List<Integer> left = recurse(s.substring(0,i));
                List<Integer> right = recurse(s.substring(i+1));

                for(int x: left){
                    for(int y: right){
                        if(ch=='+') ans.add(x+y);
                        else if(ch=='-') ans.add(x-y);
                        else if(ch=='*') ans.add(x*y);
                    }
                }
            }
        }

        return ans;
    }
}
