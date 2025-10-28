class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
        
    }
}