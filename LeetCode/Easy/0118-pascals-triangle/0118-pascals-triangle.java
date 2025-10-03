class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int n = numRows;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            List<Integer> tempList = new ArrayList<>();
            ans.add(generateRow(i));
        }
        return ans;
    }

    private List<Integer> generateRow(int rowNum){
        int ans = 1; 
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1; col < rowNum; col++){
            ans = ans * (rowNum - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }

}