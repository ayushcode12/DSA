class MinStack {

    private Stack<Long> st;
    private long min;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        long v = val;
        if(st.isEmpty()){
            min = v;
            st.push(v);
            return;
        }

        else{
            if(min < v){
                st.push(v);
            }
            else{
                st.push((2 * v) - min);
                min = v;
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        long new_val = st.peek();
        
        if(new_val < min) min = (2 * min) - new_val;
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        
        long top = st.peek();
        if(st.peek() < min) return (int) min;
        else return (int) top; 
    }
    
    public int getMin() {
        return (int) min;
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