// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        Stack<String> s = new Stack<>();
        int n = post_exp.length();

        // Traverse the postfix expression from left to right
        for (int i = 0; i < n; i++) {
            char c = post_exp.charAt(i);

            // If the character is an operand, push it to the stack
            if (Character.isLetterOrDigit(c)) {
                s.push(String.valueOf(c));
            } else {
                // Pop two operands from the stack
                String op2 = s.pop();
                String op1 = s.pop();

                // Form the new prefix expression and push back to stack
                s.push(c + op1 + op2);
            }
        }
        
        return s.peek();
    }
}
