class Solution {
    public int divide(int dividend, int divisor) {
    // Special case: overflow
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }

    boolean sign = true;
    if (dividend >= 0 && divisor < 0) sign = false;
    if (dividend < 0 && divisor > 0) sign = false;

    long n = Math.abs((long) dividend);   // FIX 1
    long d = Math.abs((long) divisor);    // FIX 1

    long ans = 0L;                        // FIX 2  (was int)

    while (d <= n) {
        int cnt = 0;

        // FIX 3: correct parentheses & use long shift
        while ((d << (cnt + 1)) <= n) {
            cnt++;
        }

        // FIX 4: use long shift, not int shift
        ans += (1L << cnt);

        // FIX 5: multiply using long
        n = n - (d * (1L << cnt));
    }

    // Apply sign
    if (!sign) ans = -ans;

    // Clamp final result
    if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
    if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

    return (int) ans;
}
}