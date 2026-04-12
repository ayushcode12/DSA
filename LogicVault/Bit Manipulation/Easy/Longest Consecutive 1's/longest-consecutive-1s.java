class Solution {
    public static int maxConsecutiveOnes(int n) {
        
        int count = 0;
        int max = 0;
        // code here
        while(n > 0){
            if((n & 1) != 0){
                n = n >> 1;
                count++;
                max = Math.max(max, count);
            }
            else{
                n = n >> 1;
                count = 0;
            }
        }
        return max;
    }
}
