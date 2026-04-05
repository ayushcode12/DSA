class Solution {
    public String longestPalindrome(String s) {

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){

            // Odd length
            int len1 = expand(s, i, i);

            // Even length
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            // update result
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right){

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1; // length of palindrome
    }
}