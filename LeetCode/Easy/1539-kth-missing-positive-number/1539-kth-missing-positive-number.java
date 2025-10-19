class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] <= k){
                k++;
            }
            else break;
        }
        return k;
    }
}