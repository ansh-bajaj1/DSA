class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int dist=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
            int d =Math.min(Math.abs(i - startIndex),words.length -Math.abs(i - startIndex));
            dist = Math.min(dist, d);
            }
        }
        return dist==Integer.MAX_VALUE?-1:dist;
    }
}