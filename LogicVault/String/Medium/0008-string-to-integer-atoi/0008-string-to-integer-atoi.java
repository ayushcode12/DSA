class Solution {
    public int myAtoi(String s) {

        s=s.trim();

        if(s.isEmpty()) return 0;
        
        int i = 0;
        int sign = 1;
        int n = s.length();

        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;

        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(result > Integer.MAX_VALUE / 10 || 
                result == Integer.MAX_VALUE / 10 && 
                digit > Integer.MAX_VALUE % 10){
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result = result * 10 + digit;

            i++;
        }

        return (result * sign);

    }
}