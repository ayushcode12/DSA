class Solution {
    public static boolean isSparse(int n) {
        
        int count = 0;
        // code here
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            else{
                count = 0;
            }
            n = n >> 1;
            
            if(count == 2) return false;
        }
        
        return true;
    }
}
