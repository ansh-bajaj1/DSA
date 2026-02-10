class Solution {
    private boolean recurse(char[][] arr, String words,int i,int j,int k){
        if(k==words.length()) return true;
        if(i<0|| j<0||i>=arr.length || j>=arr[0].length || arr[i][j]=='$'){
            return false;
        }
        if(arr[i][j]!=words.charAt(k)) return false;
        
        char t = arr[i][j];
        arr[i][j]='$';
        if(recurse(arr,words,i+1,j,k+1)) return true;
        if(recurse(arr,words,i,j+1,k+1)) return true;
        if(recurse(arr,words,i,j-1,k+1)) return true;
        if(recurse(arr,words,i-1,j,k+1)) return true;

        arr[i][j]=t;
        return false;

    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(recurse(board,word,i,j,0)) return true;
                }
            }
        }
        return false;
    }
    
}