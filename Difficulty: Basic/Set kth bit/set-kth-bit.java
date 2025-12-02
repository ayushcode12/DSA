// User function Template for Java
class Solution {
    static int setKthBit(int n, int k) {
        // code here
        return n | (1 << k);
        // n = 9 
        // k = 2
        // 9 = 1001
        // 1<<k = 1<<2 = 100
        // 1001 | 100 = 1101
    }
}