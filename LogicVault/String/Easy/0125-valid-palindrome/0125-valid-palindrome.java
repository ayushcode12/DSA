class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(c);
            }
        }

        s = filtered.toString();

        if (s.length() == 0) {
            return true;
}

        for (int i = 0; i <= (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
