class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        int ans = 0;
        
        for(int n : arr) ans ^= n;
        
        int k = ans & (~(ans - 1));
        int res1 = 0;
        int res2 = 0;
        
        for(int n : arr){
            if((n & k) != 0){
                res1 ^= n;
            }
            else{
                res2 ^= n;
            }
        }
        ArrayList<Integer> fans = new ArrayList<>();
        
        if (res1 > res2) {
            fans.add(res1);
            fans.add(res2);
        } else {
            fans.add(res2);
            fans.add(res1);
        }
        return fans;
    }
}
