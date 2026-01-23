class MinStack {

    private Stack<Integer> st;
    private int min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            min = val;
            st.push(val);
            return;
        }

        else{
            if(min < val){
                st.push(val);
            }
            else{
                st.push((2 * val) - min);
                min = val;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        int new_val = st.peek();
        
        if(new_val < min) min = (2 * min) - new_val;
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()) return -1;

        if(st.peek() < min) return min;
        else return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */