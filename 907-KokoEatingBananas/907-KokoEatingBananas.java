// Last updated: 7/9/2026, 9:49:24 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = -1;
        for(int i = 0; i < piles.length; i++) {
            if (piles[i] > right) {
                right = piles[i];
            }
        }
        int ans = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            long hours = 0;
            for (int i : piles) {
                hours += (i + mid - 1) / mid;  
            }
            if (hours <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}