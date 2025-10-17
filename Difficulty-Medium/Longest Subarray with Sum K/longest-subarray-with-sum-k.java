// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;

        HashMap<Long, Integer> preSum = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // Case 1: Entire subarray from 0 to i has sum k
            if (sum == k) {
                maxLen = i + 1;
            }

            long rem = sum - k;

            // Case 2: If a prefix sum exists such that currentSum - prefixSum = k
            if (preSum.containsKey(rem)) {
                int len = i - preSum.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSum.containsKey(sum)) {
                preSum.put(sum, i);
            }
        }

        return maxLen;
    }
}
