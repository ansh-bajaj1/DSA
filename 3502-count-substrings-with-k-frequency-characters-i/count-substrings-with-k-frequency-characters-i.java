class Solution {
    public int numberOfSubstrings(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        // for(char i: s.toCharArray()){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        int c=0;
        int i=0,j=0;
        while(j<s.length()){
            char a= s.charAt(j);
            map.put(a,map.getOrDefault(a,0)+1);
            while(map.get(a)>=k){
                 c+=s.length()-j;
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            j++;
        }
        return c;
    }
}