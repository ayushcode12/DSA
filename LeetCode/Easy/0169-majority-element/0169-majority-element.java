class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        
        return -1;
    }
}