class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];
        
        for(int i = 0; i < n; i++){
            temp[(i + k) % n] = nums[i];
        }

        for(int j = 0; j < n; j++){
            nums[j] = temp[j];
        }

    }
}