public class Solution {
    public static void toBinary(int n) {
        // code here
        String res = "";
        while(n > 0){
            if(n % 2 == 1) res = res + '1';
            else res = res + '0';
            n = n/2;
        }
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        res = sb.toString();
        System.out.print(res);
    }
}
