// Last updated: 7/9/2026, 9:50:15 AM
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];     
        for (int i=0;i<s.length();i++) {
            freq[s.charAt(i)]++;
        }
        int length = 0;
        boolean hasOdd = false;
        for (int i=0;i<128;i++) {
            length += (freq[i]/2)*2;
            if (freq[i]%2==1){
                hasOdd=true;
            }
        }
        if(hasOdd){
            length++;
        }       
        return length;
    }
}