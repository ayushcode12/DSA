class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        
        int n = arr.length;
        
        int low = 0;
        int high = n - 1;
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[mid] >= target){
                high = mid - 1;
            }
            
            else{
                low = mid + 1;
            }
        }
        return low;
        
    }
}
