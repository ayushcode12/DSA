// User function Template for Java
class Solution {
    static int setBits(int n) {
        
        int count = 0;
        // code here
        while(n > 0){
            
            if((n & 1) != 0) count++;
            
            n = n >> 1;
        }
        
        return count;
    }
}