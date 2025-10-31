class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean ans = false;

        for(int i = 0; i < row; i++){
            if(target <= matrix[i][col-1] && target >= matrix[i][0]){
                ans = searchEachRow(matrix[i], col, target);
                if(ans) return true;
            }
        }
        return false;
    }

    public boolean searchEachRow(int[] matrix, int col, int target){
        int low = 0;
        int high = col - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(matrix[mid] == target) return true;

            else if(matrix[mid] > target) high = mid - 1;

            else low = mid + 1;
        }
        return false;
    }

}