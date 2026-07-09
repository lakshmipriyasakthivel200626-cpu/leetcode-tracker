// Last updated: 7/9/2026, 9:47:40 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0, total = 0;
        for (int n : nums) maxFreq = Math.max(maxFreq, ++freq[n]);
        for (int f : freq) if (f == maxFreq) total += f;
        return total;
    }
}
