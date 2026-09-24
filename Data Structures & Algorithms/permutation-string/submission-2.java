class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s2l = s2.length();
        int s1l = s1.length();
        if (s2l < s1l) {
            return false;
        }
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        int i = 0;
        while (i + s1l <= s2l) {
            String current = s2.substring(i, i + s1l);
            char[] currentchars = current.toCharArray();
            Arrays.sort(currentchars);
            String currentsorted = new String(currentchars);
            if (sorted.equals(currentsorted)) {
                return true;
            }
            i++;
        }
        return false;
    }
}
