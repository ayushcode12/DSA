// User function Template for Java
class Solution {
    static int onesComplement(int N) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        while(N > 0){
            sb.append(N % 2 == 1 ? '1' : '0');
            N = N / 2;
        }
        
        sb.reverse();
        
        int len = sb.length();
        
        int i = 0;
        
        while(i < len){
            if(sb.charAt(i) == '1') sb.setCharAt(i, '0');
            else sb.setCharAt(i, '1');
            i++;
        }
        
        int num = 0;
        int p2 = 1;
        
        for(i = len - 1; i >= 0; i--){
            if(sb.charAt(i) == '1') num = num + p2;
            p2 = p2 * 2;
        }
        return num;
        
    }
}