class Solution {
    public boolean isPalindrome(String s) {
        String val = "";
        for(int i=0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(ch)) {
                val += ch;
            }
        }
        for (int i = 0; i < val.length() / 2; i++) {
            if (val.charAt(i) != val.charAt(val.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
