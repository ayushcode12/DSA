class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int n = numRows;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            List<Integer> tempList = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                tempList.add(nCr(i-1, j-1));
            }
            ans.add(tempList);
        }
        return ans;
    }

    private int nCr(int i, int j){
        int res = 1;
        for(int k = 0; k < j; k++){
            res = res * (i - k);
            res = res / (k + 1);
        }
        return res;
    }

}