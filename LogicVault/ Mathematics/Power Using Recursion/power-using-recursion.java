class Solution {
    static int RecursivePower(int n, int p) {
        // Code here
        if(p == 0) return 1;
        
        if(p == 1) return n;
        
        return n * RecursivePower(n, p - 1);
    }
}
