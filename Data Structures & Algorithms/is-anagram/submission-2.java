class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            boolean found = false;

            for (int j = 0; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {

                    String start = t.substring(0, j);
                    String end = t.substring(j + 1);

                    t = start + end;

                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return t.length() == 0;
    }
}