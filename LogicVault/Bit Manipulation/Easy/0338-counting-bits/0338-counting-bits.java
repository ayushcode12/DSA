class Solution {
    public int[] countBits(int n) {

        int[] ans = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            int count = 0;
            int temp = i;
            while(temp > 0){
                temp = temp & (temp - 1);
                count = count + 1; 
            }
            ans[i] = count;
        }
        return ans;
    }
}