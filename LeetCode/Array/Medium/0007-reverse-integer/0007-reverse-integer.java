class Solution {
    public int reverse(int x) {
        int RN = 0;
        while(x>0 || x<0){
            int ld=x%10;
            x=x/10;
            if (RN > Integer.MAX_VALUE / 10 || (RN == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }
            if (RN < Integer.MIN_VALUE / 10 || (RN == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            RN = RN * 10 + ld;
        }
        return RN;
    }
}