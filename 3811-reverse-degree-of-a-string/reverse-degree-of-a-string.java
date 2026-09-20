class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int c=26;
        for(char i='a';i<='z';i++){
            map.put(i,c);
            c--;
        }
        int a=0;
        for(int i=0;i<s.length();i++){
            a+=map.get(s.charAt(i))*(i+1);
        }
        return a;
    }
}