class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int a = count(answerKey,k,'F');
        int b = count(answerKey,k,'T');
        return Math.max(a,b);
    }
    public int count(String s, int k,char f){
        int i=0,j=0;
        int c=0,a=0;
        while(j<s.length()){
            if(s.charAt(j)==f){
                c++;
            }
            while(c>k){
                if(s.charAt(i)==f){
                c--;
            }
                i++;
            }
            a=Math.max(a,j-i+1);
            j++;
        }
        return a;
    }
}