class Solution {
    public long dividePlayers(int[] skill) {
        long s=0;
        int t=0;
        Arrays.sort(skill);
        for(int i=0;i<skill.length/2;i++){
            int prev=t;
             t= skill[i]+skill[skill.length-i-1];
            if(i!=0 && t!=prev){
                return -1;
            }
            else{
                s+=(long) skill[i]*skill[skill.length - i - 1];
            }
             
            
        }
        return s;
    }
}