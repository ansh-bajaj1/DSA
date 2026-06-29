class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String i : patterns){
            if(word.contains(i)) c++;
        }
        return c;

    }
}