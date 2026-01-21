class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();// Temporary array with max possible size
        
        int sqrtN = (int) Math.sqrt(n);
        
        // Iterate from 1 to sqrtN
        for(int i = 1; i <= sqrtN; i++) {
            
            // If a divisor is found
            if(n % i == 0) {
                list.add(i);
                /* Add the counterpart divisor
                 if it's different from i */
                if(i != n / i) {
                    list.add(n / i);
                }
            }
        }
        
        Collections.sort(list);
        
        for(int x : list){
            System.out.print(x + " ");
        }
    }
}
