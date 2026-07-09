// Last updated: 7/9/2026, 9:48:24 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean flag = true;

            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }
        return count;
    }
}
