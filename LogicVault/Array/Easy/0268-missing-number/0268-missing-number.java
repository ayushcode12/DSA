class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int actual_sum = (n*(n+1))/2;
        int given_sum = 0;

        for(int i = 0; i < n; i++){
            given_sum += nums[i];
        }

        return actual_sum - given_sum;

    }
}