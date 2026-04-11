class Solution {
    // Function to convert Binary string to Gray string
    static String binToGrey(String B) {
        StringBuilder res = new StringBuilder();
        
        // The MSB is always the same
        res.append(B.charAt(0));
        
        // G[i] = B[i] ^ B[i-1]
        for (int i = 1; i < B.length(); i++) {
            int b1 = B.charAt(i) - '0';
            int b2 = B.charAt(i - 1) - '0';
            res.append(b1 ^ b2);
        }
        
        return res.toString();
    }

    // Function to convert Gray string to Binary string
    static String greyToBin(String G) {
        StringBuilder res = new StringBuilder();
        
        // The MSB is always the same
        res.append(G.charAt(0));
        
        // B[i] = G[i] ^ B[i-1]
        for (int i = 1; i < G.length(); i++) {
            int gBit = G.charAt(i) - '0';
            // We take the last appended bit from our result string
            int lastBinaryBit = res.charAt(i - 1) - '0';
            res.append(gBit ^ lastBinaryBit);
        }
        
        return res.toString();
    }
}