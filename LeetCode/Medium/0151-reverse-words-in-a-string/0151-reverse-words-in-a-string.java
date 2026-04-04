class Solution {
    public String reverseWords(String s) {
        
        // Step 1: split words (handle multiple spaces)
        String[] words = s.trim().split("\\s+");

        // Step 2: reverse order
        StringBuilder result = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }

        return result.toString();
    }
}