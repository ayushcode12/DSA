class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        
        // assume all numbers are prime initially
        for(int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes
        for(int i = 2; i * i < n; i++) {
            if(isPrime[i]) {
                for(int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++) {
            if(isPrime[i]) count++;
        }

        return count;
    }
}
