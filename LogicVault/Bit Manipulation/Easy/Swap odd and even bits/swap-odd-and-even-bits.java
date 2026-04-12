class Solution {
    public static int swapBits(int n) {
        // code here
        int evenMask = 0xAAAAAAAA;
        int oddMask = 0x55555555;
        
        int nWithEvenBits = (n & evenMask);
        int nWithOddBits = (n & oddMask);
        
        int rightShiftedEvenBits = (nWithEvenBits >> 1);
        int leftShiftedOddBits = (nWithOddBits << 1);
        
        return (rightShiftedEvenBits | leftShiftedOddBits);
     }
}