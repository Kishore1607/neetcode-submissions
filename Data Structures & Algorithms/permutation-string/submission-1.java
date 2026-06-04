class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m > n) return false;

        int[] s1Count = new int[26];
        int[] window = new int[26];

        // count s1 characters
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            // add current char to window
            window[s2.charAt(i) - 'a']++;

            // remove left char when window > m
            if (i >= m) {
                window[s2.charAt(i - m) - 'a']--;
            }

            // compare arrays
            if (Arrays.equals(s1Count, window)) {
                return true;
            }
        }

        return false;
    }
}