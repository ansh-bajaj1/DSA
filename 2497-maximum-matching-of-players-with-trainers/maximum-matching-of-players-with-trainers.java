class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int j=0,c=0,i=0;
        Arrays.sort(trainers);
        Arrays.sort(players);
       while(i<players.length && j<trainers.length){
            if(trainers[j]>=players[i]){
                c++;
                j++;
                i++;
            }
            else j++;
            
        }
        return c;
    }
}