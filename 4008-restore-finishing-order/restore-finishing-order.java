class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        int j=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                arr[j]=order[i];
                j++;
            }
        }
        return arr;
    }
}