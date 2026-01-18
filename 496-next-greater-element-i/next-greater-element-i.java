class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int j=0;
        for(int i=0;i<nums1.length;i++){
            int a = search(nums2,nums1[i]);
            ans[j++]=a;
        }
        return ans;
    }
    private int search(int[] arr,int a){
        int i=0;
        while(i<arr.length){
            if(arr[i]==a) break;
            i++;
        }
        while(i<arr.length){
            if(arr[i]>a){
                return arr[i];
            }
            i++;
        }
        return -1;
    }
}