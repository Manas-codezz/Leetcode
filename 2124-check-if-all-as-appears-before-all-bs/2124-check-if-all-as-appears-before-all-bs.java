class Solution {
    public boolean checkString(String s) {
        int j = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return true;
        }
        for (int i = j; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}
