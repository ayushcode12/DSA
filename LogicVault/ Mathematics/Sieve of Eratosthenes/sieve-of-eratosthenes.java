class Solution {
    public int[] sieve(int n) {
        
        boolean[] arr = new boolean[n+1];
        
        Arrays.fill(arr, true);
        
        for(int i = 2; i * i <= n; i++){
            if(arr[i]){
                for(int j = 2*i; j <= n; j = j+i){
                    arr[j] = false;
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            if(arr[i] == true){
                ans.add(i);
            }
        }
        
        int[] result = new int[ans.size()];
        
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        
        return result;
    }    
}