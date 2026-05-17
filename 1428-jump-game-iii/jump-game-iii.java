class Solution {
    public boolean canReach(int[] arr, int start) {
        return solve(arr, start);
    }

    private boolean solve(int[] arr, int s) {
        if (s < 0 || s >= arr.length || arr[s] == -1) return false;
        if (arr[s] == 0) return true;
        
        int jump = arr[s];
        arr[s] = -1; 

        return solve(arr, s + jump) || solve(arr, s - jump);
    }
}