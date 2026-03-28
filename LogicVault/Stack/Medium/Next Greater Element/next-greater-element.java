class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans.add(-1);
            else ans.add(st.peek());
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}