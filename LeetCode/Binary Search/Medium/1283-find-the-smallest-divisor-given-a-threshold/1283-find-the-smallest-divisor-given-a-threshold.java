class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int low = 1;
        int high = findMax(nums, n);

        if(n > threshold) return -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(sumByDivisor(nums, mid, n) <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public int findMax(int[] nums, int n){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public int sumByDivisor(int[] nums, int mid, int n){
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += Math.ceil((double)(nums[i])/(double)(mid));
        }
        return sum;
    }

}