class Solution {
    public static void print_divisors(int n) {

        int i;

        for(i = 1; i * i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

        for(int j = i - 1; j >= 1; j--){
            if(n % j == 0 && j != n / j){
                System.out.print(n / j + " ");
            }
        }
    }
}
