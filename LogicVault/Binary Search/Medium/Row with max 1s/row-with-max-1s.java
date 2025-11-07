// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = arr.length;
        int col = arr[0].length;
        int index = -1;
        int maxCount = 0;
        
        for(int i = 0; i < row; i++){
            int oneCount = col - (lowerBound(arr[i], col, 1));
            if(oneCount > maxCount){
                maxCount = oneCount;
                index = i;
            }
        }
        return index;
    }
    
    public int lowerBound(int[] matrix, int n, int x){
        int low = 0;
        int high = n - 1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(matrix[mid] >= x){
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