class Solution {
    public int romanToInt(String s) {
        int i = 0;
        int ans = 0;

        while (i < s.length()) {
            // Check two-character symbols first
            if (i + 1 < s.length()) {
                String pair = s.substring(i, i + 2);

                if (pair.equals("IV")) { ans += 4; i += 2; continue; }
                if (pair.equals("IX")) { ans += 9; i += 2; continue; }
                if (pair.equals("XL")) { ans += 40; i += 2; continue; }
                if (pair.equals("XC")) { ans += 90; i += 2; continue; }
                if (pair.equals("CD")) { ans += 400; i += 2; continue; }
                if (pair.equals("CM")) { ans += 900; i += 2; continue; }
            }

            // Single character case
            ans += value(s.charAt(i));
            i++;
        }

        return ans;
    }

    private int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}