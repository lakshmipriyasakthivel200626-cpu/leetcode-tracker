// Last updated: 7/23/2026, 2:39:50 PM
1import java.util.*;
2
3class Solution {
4    public int lengthOfLongestSubstring(String s) {
5
6        int max = 0;
7        HashSet<Character> set = new HashSet<>();
8        int j = 0;
9
10        for (int i = 0; i < s.length(); i++) {
11
12            while (set.contains(s.charAt(i))) {
13                set.remove(s.charAt(j));
14                j++;
15            }
16
17            set.add(s.charAt(i));
18
19            int len = i - j + 1;
20            max = Math.max(max, len);
21        }
22
23        return max;
24    }
25}