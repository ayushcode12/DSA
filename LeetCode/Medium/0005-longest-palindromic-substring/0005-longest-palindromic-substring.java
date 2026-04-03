class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();
        String ans = "";

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                int left = i;
                int right = j;
                boolean isPalindrome = true;

                // check if substring (i, j) is palindrome
                while(left < right){
                    if(s.charAt(left) != s.charAt(right)){
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                // if palindrome, check length
                if(isPalindrome){
                    if(j - i + 1 > ans.length()){
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }

        return ans;
    }
}
