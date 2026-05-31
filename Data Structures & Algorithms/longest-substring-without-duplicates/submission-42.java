class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lng = 0;
        for (int i = 0; i < s.length(); i++) {
            List<Character> current = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (current.contains(s.charAt(j))) {
                    break;
                }
                current.add(s.charAt(j));
            }
            lng = Math.max(lng, current.size());
        }
        return lng;
    }
}
