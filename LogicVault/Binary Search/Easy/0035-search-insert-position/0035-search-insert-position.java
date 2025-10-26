class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = n;

        while(high >= low){
            int mid = (low + high)/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            
            else{
                low = mid + 1;
            }

        }

        return ans;

    }
}