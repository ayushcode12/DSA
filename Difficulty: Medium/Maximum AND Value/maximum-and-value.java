class Solution {
    
    // Helper function to count elements that match a bit pattern
    public int countMatches(int pattern, List<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            // A number matches if it has all bits of the pattern set
            if ((num & pattern) == pattern) {
                count++;
            }
        }
        return count;
    }

    public int maxAND(List<Integer> arr) {
        int res = 0;

        // Iterate from the MSB (31) to LSB (0)
        for (int bit = 31; bit >= 0; bit--) {
            // Create a candidate pattern by adding the current bit to our result
            int candidatePattern = res | (1 << bit);

            // Count how many numbers in the array possess this pattern
            if (countMatches(candidatePattern, arr) >= 2) {
                // If at least two numbers match, this bit can be part of the max AND
                res = candidatePattern;
            }
        }

        return res;
    }
}