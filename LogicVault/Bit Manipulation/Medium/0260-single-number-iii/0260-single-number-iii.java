class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        
        for(int n : nums) ans ^= n;
        
        int k = ans & (~(ans - 1));
        int res1 = 0;
        int res2 = 0;
        
        for(int n : nums){
            if((n & k) != 0){
                res1 ^= n;
            }
            else{
                res2 ^= n;
            }
        }
        int[] arr = new int[2];
        
        arr[0] = res1;
        arr[1] = res2;

        return arr;
    }
}