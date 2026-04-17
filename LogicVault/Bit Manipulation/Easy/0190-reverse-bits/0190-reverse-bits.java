class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;          // Make room
            result |= (n & 1);     // Add the bit
            n >>>= 1;              // Move to next bit (unsigned)
        }
        return result;
    }
}