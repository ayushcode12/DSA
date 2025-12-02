// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int n = b.length();
        int num = 0;
        int p2 = 1;
        
        for(int i = n-1; i >= 0; i--){
            if(b.charAt(i) == '1') num = num + p2;
            p2 = p2 * 2;
        }
        return num;
    }
}