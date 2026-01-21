class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        for(int num = 0; num < (1 << n); num++){
            List<Integer> subset = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if((num & (1 << i)) != 0){
                    subset.add(nums[i]);
                }
            }
            ans.add(subset);
        }
        return ans;
    }
}