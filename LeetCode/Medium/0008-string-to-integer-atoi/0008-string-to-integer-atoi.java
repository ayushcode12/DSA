class Solution {
    public int myAtoi(String temp) {
        
        String s = temp.trim();
        if(s.isEmpty()) return 0;

        int i = 0;
        int sign = 1;

        // Step 1: Handle sign
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;

        // Step 2: Traverse digits
        while(i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Step 3: Handle overflow BEFORE updating result
            if(result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}