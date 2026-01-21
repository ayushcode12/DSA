// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        
        return fn(l - 1) ^ fn(r);
        
    }
    public static int fn(int N){
        
        if(N % 4 == 0) return N;
        else if(N % 4 == 1) return 1;
        else if(N % 4 == 2) return N+1;
        else return 0;
        
    }
}