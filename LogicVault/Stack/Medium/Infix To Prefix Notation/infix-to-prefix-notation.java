class Solution {
    public static String infixToPrefix(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')') sb.setCharAt(i, '(');
        }
        s = sb.toString();
        
        Stack<Character> st = new Stack<>();
        int i = 0;
        String ans = "";
        int n = s.length();
        
        while(i < n){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                ans = ans + s.charAt(i);
            }
            
            else if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            
            else if (s.charAt(i) == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans = ans + st.peek();
                    st.pop();
                }
                st.pop();
            }
            else{
                if(s.charAt(i) == '^'){
                    while(!st.isEmpty() && priority(s.charAt(i)) <= priority(st.peek())){
                        ans += st.peek();
                        st.pop();
                    }
                }
                else{
                    while(!st.isEmpty() && priority(s.charAt(i)) < priority(st.peek())){
                        ans += st.peek();
                        st.pop();
                    }
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        while(!st.isEmpty()){
            ans += st.peek();
            st.pop();
        }
        
        return new StringBuilder(ans).reverse().toString();
    }
    
    public static int priority(char c) {
        if (c == '^')  
            return 3;
        else if (c == '/' || c == '*')  
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    
}