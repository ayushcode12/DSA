class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        int ans = -1;

        if(n == 1){
            ans = nums[0];
            return ans;
        }

        while(low <= high){

            int mid = (low + high)/2;

            if(low == 0){
                if(nums[low] < nums[low + 1]){
                    ans = nums[low];
                    return ans;
                }
            }

            if(high == n - 1){
                if(nums[high] > nums[high - 1]){
                    ans = nums[high];
                    return ans;
                }
            }

            low = low + 1;
            high = high - 1;

            if(nums[low] > nums[low - 1] && nums[low] < nums[low + 1]){
                ans = nums[low];
                return ans;
            }

            if(nums[high] > nums[high - 1] && nums[high] < nums[high + 1]){
                ans = nums[high];
                return ans;
            }
        }

        return ans;

    }
}