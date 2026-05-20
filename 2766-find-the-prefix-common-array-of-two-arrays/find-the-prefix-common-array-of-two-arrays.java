class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        int[] ans = new int[n];
        int c = 0;

        for (int i = 0; i < n; i++) {
            setA.add(A[i]);
            setB.add(B[i]);
            if (setB.contains(A[i])) {
                c++;
            }
            if (A[i] != B[i] && setA.contains(B[i])) {
                c++;
            }
            ans[i] = c;
        }

        return ans;
    }
}