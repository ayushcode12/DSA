class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

        if(first == n || nums[first] != target){
            return new int[]{ -1, -1 };

        }
        return new int[]{first, last};
    }

    public int lowerBound(int[] nums, int target){
        int n = nums.length;

        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;

        }

        return ans;
    }

    public int upperBound(int[] nums, int target){
        int n = nums.length;

        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] > target){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;

        }

        return ans;
    }

}