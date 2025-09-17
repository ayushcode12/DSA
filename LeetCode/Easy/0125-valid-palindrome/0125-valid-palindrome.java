class Solution {
    public boolean isPalindrome(String s) {

        // Preprocess: Remove non-alphanumeric and convert to lowercase
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(c);
            }
        }

        s = filtered.toString(); // Overwrite s with the cleaned version

        if (s.length() == 0) {
            return true;
}

        // Your original palindrome logic
        for (int i = 0; i <= (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}