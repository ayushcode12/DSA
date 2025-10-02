class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == -1){
                   matrix[i][j] = 0;
                }
            }
        }

    }

    private void markRow(int[][] matrix, int i){
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

    private void markCol(int[][] matrix, int j){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

}