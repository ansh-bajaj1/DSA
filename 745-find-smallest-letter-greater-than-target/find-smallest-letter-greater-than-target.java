class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low =0, high=letters.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(letters[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        if (letters[low] > target) {
            return letters[low];
        }
        return letters[0];    
        }
}