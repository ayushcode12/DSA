class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            max = Math.max(arr[i], max);
        }
        
        return max;
        
    }
}
