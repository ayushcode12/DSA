class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        // Check factor 2
        if (n % 2 == 0) {
            ans.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // Check odd factors
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                ans.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // If remaining n is a prime > 1
        if (n > 1) {
            ans.add(n);
        }

        return ans;
    }
}