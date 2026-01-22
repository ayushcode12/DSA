class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(st.isEmpty()) return false;

                if((st.peek() == '(' && s.charAt(i) == ')') || (st.peek() == '[' &&
                 s.charAt(i) == ']') || (st.peek() == '{' && s.charAt(i) == '}')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
}