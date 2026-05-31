class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m=mass;
        for(int i : asteroids ){
            if(m<i){
                return false;
            }
            else {
                m+=i;
            }
        }
        return true;
    }
}