class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        int min = (n/3) + 1;

        for(int i = 0; i < n; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value+1);

            if(map.get(nums[i]) == min){
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}