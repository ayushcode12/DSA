class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        
        int first = lowerBound(arr, target, n);
        int last = upperBound(arr, target, n) - 1;
        
        if(first == n || arr[first] != target){
            return 0;
        }
        
        return (last - first + 1);
    }
    
    public int lowerBound(int[] arr, int target, int n){
        
        int low = 0;
        int high = n - 1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        
        return ans;
        
    }
    
    public int upperBound(int[] arr, int target, int n){
        
        int low = 0;
        int high = n - 1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            
        }
        
        return ans;
        
    }
    
}
