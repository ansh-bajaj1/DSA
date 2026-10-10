class Solution {
    public int partitionString(String s) {
        int a = 1;                      
        Set<Character> set = new HashSet<>();
        
        for(char ch: s.toCharArray()){
            if(!set.contains(ch)){     
                set.add(ch);          
                continue;
            }
            
            a++;                        
            set.clear();               
            set.add(ch);               
        }
        
        return a;  
    }
}