class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int n = nums.length;

        if(n == 0) return 0;

        int longest = 1;
        int count = 0; 
        
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        for(Integer num : set){
            if(!set.contains(num - 1)){
                count = 1;
                int x = num;
                while(set.contains(x+1)){
                    x = x+1;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        
        return longest;
    }
}