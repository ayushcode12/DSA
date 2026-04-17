class Solution {
    public int lcm(int a, int b) {
        // code here
        int res = Math.max(a, b);
        
        while(true){
            if((res % a == 0) && (res % b == 0)) return res;
            res++;
        }
    }
}