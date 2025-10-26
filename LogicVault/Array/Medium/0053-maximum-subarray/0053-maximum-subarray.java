class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int max = nums[0];   // start with first element
        int sum = nums[0];   // start with first element

        for(int i = 1; i < n; i++){
            sum = Math.max(nums[i], sum + nums[i]); 
            max = Math.max(max, sum);
        }

        return max;
    }
}