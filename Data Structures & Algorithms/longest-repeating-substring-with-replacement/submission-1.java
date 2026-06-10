class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            int maxf = 0;

            for (int j = i; j < s.length(); j++) {
                count[s.charAt(j) - 'A']++;
                maxf = Math.max(maxf, count[s.charAt(j) - 'A']);

                int window = j - i + 1;

                if (window - maxf <= k) {
                    max = Math.max(max, window);
                }
            }
        }

        return max;
    }
}