// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row = arr.length;
        int col = arr[0].length;
        int index = -1;
        int maxCount = -1;
        
        for(int i = 0; i < row; i++){
            int rowCount = 0;
            for(int j = 0; j < col; j++){
                rowCount += arr[i][j];
            }
            if(rowCount > maxCount){
                maxCount = rowCount;
                index = i;
            }
        }
        return index;
    }
}