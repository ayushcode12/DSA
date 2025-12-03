class Solution {
    public int divide(int dividend, int divisor) {
        // Special case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean positive = (dividend < 0) == (divisor < 0);

        // Convert both numbers to long and take absolute value
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long result = 0;

        // Subtract the largest doubled divisor each time
        while (a >= b) {
            long temp = b;
            long multiple = 1;

            // Double temp and multiple until it exceeds a
            while ((temp << 1) <= a) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        // Apply sign
        if (!positive) result = -result;

        // Clamp to 32-bit integer range
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }
}