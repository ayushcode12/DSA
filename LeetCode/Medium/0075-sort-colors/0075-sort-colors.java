class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                count0++;
            }
            else if(nums[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        for(int i = 0; i < count0; i++){
            nums[i] = 0;
        }

        for(int i = count0; i < count0 + count1; i++){
            nums[i] = 1;
        }

        for(int i = count0 + count1; i < n; i++){
            nums[i] = 2;
        }
        
    }
}