// Last updated: 7/9/2026, 9:48:08 AM
class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int firstCount = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                if (firstCount == 0) {
                    firstCount = freq[i];
                } else if (freq[i] != firstCount) {
                    return false;
                }
            }
        }

        return true;
    }
}
