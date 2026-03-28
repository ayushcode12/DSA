class MyQueue {

    private Stack<Integer> input, output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        // If queue is still empty, return -1 (or throw an error if preferred)
        if (output.isEmpty()) {
            System.out.println("Queue is empty, cannot pop.");
            return -1;
        }

        return output.pop();
    }
    
    public int peek() {
         if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        // If queue is still empty, return -1 (or throw an error if preferred)
        if (output.isEmpty()) {
            System.out.println("Queue is empty, cannot peek.");
            return -1;
        }

        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */