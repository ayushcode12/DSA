class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = arr.length;
        
        int max = arr[n - 1];
        ans.add(arr[n - 1]);
        
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] >= max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        
        Collections.reverse(ans);
        return ans;
        
    }
}
