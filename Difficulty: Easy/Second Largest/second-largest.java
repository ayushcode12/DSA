class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) return -1;
        
        return secondMax;
    }
}