// Last updated: 7/9/2026, 9:49:36 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) return c;
        }
        return letters[0];
    }
}
