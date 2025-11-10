class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        
        int low = 0; 
        int high = stalls[n-1] - stalls[0];
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(canWePlace(stalls, mid, k, n)){
                int ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }
    
    public boolean canWePlace(int[] arr, int dist, int cows, int n){
        int last = arr[0]; 
        int noOfCows = 1;
        
        for(int i = 1; i < n; i++){
            if(arr[i] - last >= dist){
                noOfCows++;
                last = arr[i];
            }
            if(noOfCows >= cows) return true;
        }
        return false;
        
    }
    
}