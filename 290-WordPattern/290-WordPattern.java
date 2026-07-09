// Last updated: 7/9/2026, 9:50:34 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> pw = new HashMap<>();
        HashMap<String, Character> wp = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (pw.containsKey(ch)) {
                if (!pw.get(ch).equals(word)) return false;
            } else {
                pw.put(ch, word);
            }

            if (wp.containsKey(word)) {
                if (wp.get(word) != ch) return false;
            } else {
                wp.put(word, ch);
            }
        }
        return true;
    }
}
