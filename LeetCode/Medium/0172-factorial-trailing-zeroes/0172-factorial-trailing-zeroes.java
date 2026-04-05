class Solution {
    public int trailingZeroes(int n) {

        int count = 0;
        
        for(int k = 1; Math.pow(5, k) <= n; k++){
            count = count + (int)(Math.floor(n / (Math.pow(5, k))));
        }

        return count;

    }
}