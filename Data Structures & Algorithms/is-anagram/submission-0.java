class Solution {
    public boolean isAnagram(String s, String t) {
        // Length must be same
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters from s
        for (char ch : s.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Remove counts using t
        for (char ch : t.toCharArray()) {

            // Character not found
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            // Remove if count becomes 0
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        // If map is empty -> anagram
        return map.isEmpty();
    }
}
