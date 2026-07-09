// Last updated: 7/9/2026, 9:50:07 AM
import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { 
                i++; 
            }
            j++; 
        }
        return i;
    }
}
