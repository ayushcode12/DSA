class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;

        int count = 0;
        for(int i = 0; i < 32; i++){

            count += (ans & 1);

            ans = ans >> 1;
        }
        return count;
    }
}