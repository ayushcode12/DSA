// User function Template for Java
class Solution {
    int countSubstring(String S) {
        
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            int balance = 0;
            for(int j = i; j < S.length(); j++){
                char c = S.charAt(j);
                if(Character.isLowerCase(c)) balance--;
                else balance++;
                
                if(balance == 0) count++;
            }
        }
        return count;
    }
}
