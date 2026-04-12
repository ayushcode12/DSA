class Solution {
    public static int posOfRightMostDiffBit(int m, int n) {
        
        if(m == n) return -1;
        // code here
        int temp = m ^ n;
        int count = 1;
        
        while((temp & 1) == 0){
            temp = temp >> 1;
            count++;
        }
        return count;
    }
}
